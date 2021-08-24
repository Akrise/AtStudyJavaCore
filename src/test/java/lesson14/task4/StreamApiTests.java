package lesson14.task4;

import homework_solution.lesson14.helpers.JsonHelper;
import homework_solution.lesson14.model.Card;
import homework_solution.lesson14.model.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiTests {

    //Задание 1
    @Test
    public void passportThreeAccountsNoCardsTest() throws FileNotFoundException {
        List<Person> persons = JsonHelper.getPersonsFromFile("src\\main\\java\\homework_solution\\lesson14\\dataset.json");
        List<Person> filteredPersons = persons.stream().
                filter(x -> x.getPassport() != null).
                filter(x -> x.getAccounts().size() == 3).
                filter(x -> x.getCards().size() == 0).
                collect(Collectors.toList());
        Assertions.assertTrue(filteredPersons.isEmpty());
        boolean allSeriesValid = filteredPersons.stream().
                allMatch(x -> x.getPassport().getSeries().matches("[0-9]{4}"));
        boolean oneElementValid = filteredPersons.stream().
                anyMatch(x -> x.getPassport().getSeries().matches("[0-9]{4}"));
        boolean noElement = filteredPersons.stream().
                noneMatch(x -> x.getPassport().getSeries().matches("[0-9]{4}"));
        System.out.printf("%b \n%b \n%b", allSeriesValid, oneElementValid, noElement);
    }

    //Задание 2
    @Test
    public void countActiveAndInactiveCards() throws FileNotFoundException {
        List<Person> persons = JsonHelper.getPersonsFromFile("src\\main\\java\\homework_solution\\lesson14\\dataset.json");
        long peopleCardsAmount = persons.stream().
                filter(x -> x.getCards().size() != 0).
                count();
        long peopleAllCardsValid = persons.stream().
                filter(x -> x.getCards().size() != 0).
                filter(x -> {
                    boolean result = true;
                    for (Card card : x.getCards()) {
                        if (isCardActive(card)) {
                            result = false;
                        }
                    }
                    return result;
                }).
                count();
        long peopleAllCardsInactive = persons.stream().
                filter(x -> x.getCards().size() != 0).
                filter(x -> {
                    boolean result = true;
                    for (Card card : x.getCards()) {
                        if (!isCardActive(card)) {
                            result = false;
                        }
                    }
                    return result;
                }).
                count();
        long peopleMixCardsState = persons.stream().
                filter(x -> x.getCards().size() != 0).
                filter(x -> {
                    boolean allActive = true;
                    boolean allInactive = true;
                    for (Card card : x.getCards()) {
                        //Есть как минимум одна активная карта
                        if (!isCardActive(card)) {
                            allActive = false;
                        }
                        //Есть как минимум одна неактивная карта
                        if (isCardActive(card)) {
                            allInactive = false;
                        }
                    }
                    return !(allActive|allInactive);
                }).
                count();
        System.out.println(peopleCardsAmount);
        System.out.println(peopleAllCardsValid);
        System.out.println(peopleAllCardsInactive);
        System.out.println(peopleMixCardsState);
        Assertions.assertEquals(peopleCardsAmount, peopleAllCardsValid + peopleAllCardsInactive + peopleMixCardsState);
    }

    private boolean isCardActive(Card card) {
        LocalDate today = LocalDate.now();
        LocalDate validThru;
        try {
            validThru = LocalDate.parse("01." + String.format("%02d",Integer.parseInt(card.getEndDateMonth())) + ".20" + card.getEndDateYear(), DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        } catch (DateTimeParseException e) {
            throw new RuntimeException();
        }
        return today.isBefore(validThru);
    }
}
