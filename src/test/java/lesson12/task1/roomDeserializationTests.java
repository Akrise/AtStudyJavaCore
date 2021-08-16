package lesson12.task1;

import com.fasterxml.jackson.core.JsonProcessingException;
import homework_solution.lesson12.task1.Room;
import homework_solution.lesson12.task1.helpers.JsonHelper;
import homework_solution.lesson12.task1.helpers.XmlHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class roomDeserializationTests {

    @Test
    public void deserializeRoomFromJson() throws FileNotFoundException {
        FileReader fileReader = new FileReader("src\\test\\java\\lesson12\\task1\\files\\room.json");
        JsonHelper jsonHelper = new JsonHelper();
        Scanner scanner = new Scanner(fileReader);
        StringBuilder stringBuilder = new StringBuilder();
        Room expectedRoom = new Room(6, 5);

        while (scanner.hasNext()) {
            stringBuilder.append(scanner.nextLine());
        }
        Room room = (Room) jsonHelper.deserialize(stringBuilder.toString(), Room.class);
        Assertions.assertEquals(expectedRoom, room);
    }

    @Test
    public void deserializeRoomFromXML() throws FileNotFoundException, JsonProcessingException {
        FileReader fileReader = new FileReader("src\\test\\java\\lesson12\\task1\\files\\room.xml");
        Scanner scanner = new Scanner(fileReader);
        XmlHelper xmlHelper = new XmlHelper();
        Room expectedRoom = new Room(6, 5);
        StringBuilder stringBuilder = new StringBuilder();

        while (scanner.hasNext()) {
            stringBuilder.append(scanner.nextLine());
        }
        Room room = (Room) xmlHelper.deserialize(stringBuilder.toString(), Room.class);
        Assertions.assertEquals(expectedRoom, room);
    }
}
