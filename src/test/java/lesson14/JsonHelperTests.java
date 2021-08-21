package lesson14;


import homework_solution.lesson14.helpers.JsonHelper;
import homework_solution.lesson14.model.Person;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.List;

public class JsonHelperTests {

    @Test
    public void getPersonsFromFileTest() throws FileNotFoundException {
        List<Person> persons = JsonHelper.getPersonsFromFile("src\\main\\java\\homework_solution\\lesson14\\dataset.json");
        System.out.println();
    }
}
