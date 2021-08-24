package lesson14.task3;

import homework_solution.lesson14.helpers.JsonHelper;
import homework_solution.lesson14.model.Person;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.List;

public class StreamApiTests {

    //Задание 1
    @Test
    public void countUniqueSeriesTest() throws FileNotFoundException {
        List<Person> persons = JsonHelper.getPersonsFromFile("src\\main\\java\\homework_solution\\lesson14\\dataset.json");
        System.out.println("Количество различных серий паспортов: " + persons.stream().
                filter(x -> x.getPassport() != null).
                filter(x -> x.getPassport().getSeries() != null).
                map(x -> x.getPassport().getSeries()).
                distinct().
                count());
    }

    //Задание 2
    @Test
    public void threeAccountsTwoCardsTest() throws FileNotFoundException {
        List<Person> persons = JsonHelper.getPersonsFromFile("src\\main\\java\\homework_solution\\lesson14\\dataset.json");
        Person person = persons.stream().
                filter(x -> x.getPassport() != null).
                limit(100).
                skip(49).
                filter(x -> x.getCards().size() == 2).
                filter(x -> x.getAccounts().size() == 3).
                limit(1).findFirst().orElse(persons.stream().
                filter(z -> z.getPassport() != null).
                limit(100).
                skip(49).
                filter(z -> z.getCards().size() == 2).
                filter(z -> z.getAccounts().size() == 3).
                findFirst().orElse(null));
        System.out.printf("%s %s %s\n %s %s %s \n %s %s\n", person.getLastName(), person.getFirstName(), person.getPatronymic(), person.getAccounts().get(0).getAccountNumber(), person.getAccounts().get(1).getAccountNumber(), person.getAccounts().get(2).getAccountNumber(), person.getCards().get(0).getCardNumber(), person.getCards().get(1).getCardNumber());
    }

    //Задание 3
    @Test
    public void validateAllPassportsTest() throws FileNotFoundException {
        List<Person> persons = JsonHelper.getPersonsFromFile("src\\main\\java\\homework_solution\\lesson14\\dataset.json");
        boolean checkSeries = persons.stream().
                filter(x -> x.getPassport()!=null).
                allMatch(x -> x.getPassport().getSeries().matches("[0-9]{4}"));
        boolean checkNumber = persons.stream().
                filter(x -> x.getPassport()!=null).
                allMatch(x -> x.getPassport().getNumber().matches("[0-9]{6}"));
        String answer = (checkNumber && checkSeries) ? "У всех клиентов, у которых есть паспорт, данные соответствуют формату" :
        "Есть клиенты, у которых данные паспорта не соответствуют формату";
        System.out.println(answer);
    }
}