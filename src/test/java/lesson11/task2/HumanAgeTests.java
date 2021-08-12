package lesson11.task2;

import homework_solution.lesson11.task2.Human;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HumanAgeTests {

    @Test
    public void zeroAgeTest() {
        Human human = new Human();
        human.setAge(0);
        Assertions.assertEquals(0, human.getAge());
    }

    @Test
    public void middleAgeTest() {
        Human human = new Human();
        human.setAge(60);
        Assertions.assertEquals(60, human.getAge());
    }

    @Test
    public void maxAgeTest() {
        Human human = new Human();
        human.setAge(120);
        Assertions.assertEquals(120, human.getAge());
    }

    @Test
    public void belowZeroAgeExceptionTest() {
        Human human = new Human();
        int age = -1;
        try {
            human.setAge(age);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals("Некорректный возраст: " + age, e.getMessage());
        }
    }

    @Test
    public void aboveMaxAgeExceptionTest() {
        Human human = new Human();
        int age = 121;
        try {
            human.setAge(age);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals("Некорректный возраст: " + age, e.getMessage());
        }
    }
}
