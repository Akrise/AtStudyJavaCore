package lesson14.task1;

import homework_solution.lesson14.helpers.JsonHelper;
import homework_solution.lesson14.model.Person;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.List;

public class StreamApiTests {

    //Задание 1
    @Test
    public void showNoPassportThreePropertiesTest() throws FileNotFoundException {
        List<Person> persons = JsonHelper.getPersonsFromFile("src\\main\\java\\homework_solution\\lesson14\\dataset.json");
        persons.stream()
                .filter(x -> x.getPassport() == null)
                .filter(x -> x.getProperties().size() == 3)
                .forEach(x -> System.out.printf("%s %s %s\n", x.getLastName(), x.getFirstName(), x.getPatronymic()));
    }

    //Задание 2
    @Test
    public void vasilevsAccountsNotEqualCardsTest() throws FileNotFoundException {
        List<Person> persons = JsonHelper.getPersonsFromFile("src\\main\\java\\homework_solution\\lesson14\\dataset.json");
        persons.stream()
                .filter(x -> x.getLastName().equals("Васильев"))
                .filter(x -> x.getAccounts().size() != x.getCards().size())
                .forEach(x -> System.out.printf("%s %s %s\n", x.getLastName(), x.getFirstName(), x.getPatronymic()));
    }

    //Задание 3
    @Test
    public void passportStartsWithDoubleZeroTest() throws FileNotFoundException {
        List<Person> persons = JsonHelper.getPersonsFromFile("src\\main\\java\\homework_solution\\lesson14\\dataset.json");
        persons.stream()
                .filter(x -> x.getPassport() != null)
                .filter(x -> x.getPassport().getSeries() != null)
                .filter(x -> x.getPassport().getSeries().startsWith("00"))
                .limit(5)
                .forEach(x -> System.out.printf("%s %s %s\n", x.getLastName(), x.getFirstName(), x.getPatronymic()));
    }
}
