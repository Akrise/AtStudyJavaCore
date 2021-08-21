package lesson14.task2;

import homework_solution.lesson14.helpers.JsonHelper;
import homework_solution.lesson14.model.Person;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.List;

public class StreamApiTests {

    //Задание 2
    @Test
    public void showNoPassportThreePropertiesTest() throws FileNotFoundException {
        List<Person> persons = JsonHelper.getPersonsFromFile("src\\main\\java\\homework_solution\\lesson14\\dataset.json");
        //TODO как выбросить исключение NoSuchElementException&
        persons.stream().
                filter(x -> x.getPassport() != null).
                filter(x -> x.getPassport().getSeries() != null).
                filter(x -> x.getPassport().getNumber() != null).
                filter(x -> x.getPassport().getSeries().equals(x.getPassport().getNumber().substring(2, 6))).
                forEach(x -> System.out.printf("%s %s %s %s %s\n", x.getLastName(), x.getFirstName(), x.getPatronymic(), x.getPassport().getSeries(), x.getPassport().getNumber()));
    }

    //Задание 1
    @Test
    public void passportStartsWithDoubleZeroDescSortTest() throws FileNotFoundException {
        List<Person> persons = JsonHelper.getPersonsFromFile("src\\main\\java\\homework_solution\\lesson14\\dataset.json");
        persons.stream().
                filter(x -> x.getPassport() != null).
                filter(x -> x.getPassport().getSeries() != null).
                filter(x -> x.getPassport().getSeries().startsWith("00")).
                sorted((x, y) -> y.getPassport().getNumber().compareTo(x.getPassport().getNumber())).
                forEach(x -> System.out.printf("%s %s %s %s %s\n", x.getLastName(), x.getFirstName(), x.getPatronymic(), x.getPassport().getSeries(), x.getPassport().getNumber()));
    }


}
