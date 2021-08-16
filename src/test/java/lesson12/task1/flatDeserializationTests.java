package lesson12.task1;

import com.fasterxml.jackson.core.JsonProcessingException;
import homework_solution.lesson12.task1.Flat;
import homework_solution.lesson12.task1.helpers.JsonHelper;
import homework_solution.lesson12.task1.helpers.XmlHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class flatDeserializationTests {

    @Test
    public void deserializeFlatFromJson() throws FileNotFoundException {
        FileReader fileReader = new FileReader("src\\test\\java\\lesson12\\task1\\files\\flat.json");
        JsonHelper jsonHelper = new JsonHelper();
        Scanner scanner = new Scanner(fileReader);
        StringBuilder stringBuilder = new StringBuilder();
        Flat expectedFlat = new Flat().generate();

        while (scanner.hasNext()) {
            stringBuilder.append(scanner.nextLine());
        }
        Flat flat = (Flat) jsonHelper.deserialize(stringBuilder.toString(), Flat.class);
        Assertions.assertEquals(expectedFlat, flat);
    }

    @Test
    public void deserializeFlatFromXML() throws FileNotFoundException, JsonProcessingException {
        FileReader fileReader = new FileReader("src\\test\\java\\lesson12\\task1\\files\\flat.xml");
        Scanner scanner = new Scanner(fileReader);
        XmlHelper xmlHelper = new XmlHelper();
        Flat expectedFlat = new Flat().generate();
        StringBuilder stringBuilder = new StringBuilder();

        while (scanner.hasNext()) {
            stringBuilder.append(scanner.nextLine());
        }
        Flat flat = (Flat) xmlHelper.deserialize(stringBuilder.toString(), Flat.class);
        Assertions.assertEquals(expectedFlat, flat);
    }
}
