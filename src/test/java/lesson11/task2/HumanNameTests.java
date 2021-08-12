package lesson11.task2;

import homework_solution.lesson11.task2.Human;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HumanNameTests {

    @Test
    public void validNameTest() {
        Human human = new Human();
        human.setFirstName("Иван");
        Assertions.assertEquals("Иван", human.getFirstName());
    }

    @Test
    public void shortNameExceptionTest() {
        Human human = new Human();
        try {
            human.setFirstName("Ив");
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals("Некорректное имя: Ив", e.getMessage());
        }
    }

    @Test
    public void longNameExceptionTest() {
        Human human = new Human();
        String name = "Ивансдлиннымименем";
        try {
            human.setFirstName(name);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals("Некорректное имя: " + name, e.getMessage());
        }
    }

    @Test
    public void digitAtNameExceptionTest() {
        Human human = new Human();
        String name = "Иван5аа";
        try {
            human.setFirstName(name);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals("Некорректное имя: " + name, e.getMessage());
        }
    }
}
