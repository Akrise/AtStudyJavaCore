package lesson14.task5;

import homework_solution.lesson14.helpers.JsonHelper;
import homework_solution.lesson14.model.Account;
import homework_solution.lesson14.model.Person;
import homework_solution.lesson14.model.Properties;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamApiTests {

    //задание 1
    @Test
    public void lessThenTwoPointOneMillionsSavings() throws FileNotFoundException {
        List<Person> persons = JsonHelper.getPersonsFromFile("src\\main\\java\\homework_solution\\lesson14\\dataset.json");
        Map<Person, Double> savings = persons.stream()
                .filter(x -> x.getAccounts().size() != 0)
                .collect(Collectors.toMap(x -> x, x -> x.getAccounts().stream()
                        .map(Account::getAccountBalance)
                        .reduce(Double::sum)
                        .get()));
        savings.forEach((key, value) -> {
            if (value < 2_100_000)
                System.out.printf("%s %s %s: %.2f\n", key.getLastName(), key.getFirstName(), key.getPatronymic(), value);
        });
    }

    //Задание 2
    @Test
    public void maxResidentialEstate() throws FileNotFoundException {
        List<Person> persons = JsonHelper.getPersonsFromFile("src\\main\\java\\homework_solution\\lesson14\\dataset.json");

        Map.Entry<Person, Double> maxResidential = persons.stream()
                .filter(x -> x.getAccounts().size() != 0)
                .collect(Collectors.toMap(x -> x, x -> x.getProperties().stream()
                        .filter(y -> y.getType().equals("Жилая"))
                        .map(Properties::getPrice)
                        .reduce(Double::sum)
                        .orElse(0.0)))
                .entrySet()
                .stream()
                .max(Comparator.comparing(Map.Entry::getValue))
                .get();
        System.out.printf("%s %s %s: %.2f", maxResidential.getKey().getLastName(), maxResidential.getKey().getFirstName(), maxResidential.getKey().getPatronymic(), maxResidential.getValue());
    }
}