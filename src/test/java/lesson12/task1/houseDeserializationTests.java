package lesson12.task1;

import com.fasterxml.jackson.core.JsonProcessingException;
import homework_solution.lesson12.task1.House;
import homework_solution.lesson12.task1.helpers.JsonHelper;
import homework_solution.lesson12.task1.helpers.XmlHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class houseDeserializationTests {

    @Test
    public void deserializeHouseFromJson() throws FileNotFoundException {
        FileReader fileReader = new FileReader("src\\test\\java\\lesson12\\task1\\files\\house.json");
        JsonHelper jsonHelper = new JsonHelper();
        Scanner scanner = new Scanner(fileReader);
        StringBuilder stringBuilder = new StringBuilder();
        House expectedHouse = new House().generate();

        while (scanner.hasNext()) {
            stringBuilder.append(scanner.nextLine());
        }
        House house = (House) jsonHelper.deserialize(stringBuilder.toString(), House.class);
        Assertions.assertEquals(expectedHouse, house);
    }

    @Test
    public void deserializeHouseFromXML() throws FileNotFoundException, JsonProcessingException {
        FileReader fileReader = new FileReader("src\\test\\java\\lesson12\\task1\\files\\house.xml");
        Scanner scanner = new Scanner(fileReader);
        XmlHelper xmlHelper = new XmlHelper();
        House expectedHouse = new House().generate();
        StringBuilder stringBuilder = new StringBuilder();

        while (scanner.hasNext()) {
            stringBuilder.append(scanner.nextLine());
        }
        House house = (House) xmlHelper.deserialize(stringBuilder.toString(), House.class);
        Assertions.assertEquals(expectedHouse, house);
    }
}
