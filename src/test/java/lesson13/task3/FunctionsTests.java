package lesson13.task3;

import homework_solution.lesson13.task3.Functions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class FunctionsTests {

    @Test
    public void objectToStringFuncTest() {
        Object object = new Object();
        Assertions.assertEquals(object.toString(), Functions.toStringFunction.execute(object));
    }

    @Test
    public void stringToStringFuncTest() {
        Assertions.assertEquals("qwerty", Functions.toStringFunction.execute("qwerty"));
    }

    @Test
    public void catToStringFuncTest() {
        Cat cat = new Cat("Мурка", 3);
        Assertions.assertEquals("Имя: Мурка, Возраст 3", Functions.toStringFunction.execute(cat));
    }

    @Test
    public void summFuncTest() {
        Assertions.assertEquals(55, Functions.summFunction.execute(Arrays.asList(1, 2, 3, 4, 5, 10, 9, 8, 7, 6)));
    }

    @Test
    public void sameObjectsOnlyEquals() {
        Object firstCat = new Cat("Барсик", 2);
        Object secondCat = new Cat("Барсик", 2);
        Object thirdCat = new Cat("Барсик", 2);
        Assertions.assertTrue(Functions.onlyEquals.execute(Arrays.asList(firstCat, secondCat, thirdCat)));
    }

    @Test
    public void unequalsObjectsOnlyEquals() {
        Object firstCat = new Cat("Барсик", 2);
        Object secondCat = new Cat("Барсик", 3);
        Object thirdCat = new Cat("Барсик", 2);
        Assertions.assertFalse(Functions.onlyEquals.execute(Arrays.asList(firstCat, secondCat, thirdCat)));
    }

    @Test
    public void emptyListOnlyEqualsTest() {
        Assertions.assertTrue(Functions.onlyEquals.execute(Collections.EMPTY_LIST));
    }

    @Test
    public void sameStringsOnlyEqualsTest() {
        Assertions.assertTrue(Functions.onlyEquals.execute(Arrays.asList("Qwerty", "Qwerty", "Qwerty")));
    }

    @Test
    public void unequalStringsOnlyEqualsTest() {
        Assertions.assertFalse(Functions.onlyEquals.execute(Arrays.asList("Qwerty", "Qwerty", "Zabr")));
    }

    @Test
    public void sameCatsStringsOnlyEqualsTest() {
        Cat catOne = new Cat("Мурка", 3);
        Cat catTwo = new Cat("Мурка", 3);
        Cat catThree = new Cat("Мурка", 3);
        Assertions.assertTrue(Functions.onlyEquals.execute(Arrays.asList(catOne, catTwo, catThree)));
    }

    @Test
    public void unequalCatsStringsOnlyEqualsTest() {
        Cat catOne = new Cat("Мурка", 4);
        Cat catTwo = new Cat("Мурка", 3);
        Cat catThree = new Cat("Мурка", 3);
        Assertions.assertFalse(Functions.onlyEquals.execute(Arrays.asList(catOne, catTwo, catThree)));
    }

    @Test
    public void doubleListMaxObjectFuncTest() {
        List<Comparable> doubles = Arrays.asList(89.2, 10.2, 9.0, 3.1, -1.0, 103.3);
        Assertions.assertEquals(103.3, Functions.maxObject.execute(doubles));
    }

    @Test
    public void stringListMaxObjectFuncTest() {
        List<Comparable> strings = Arrays.asList("ZZZZ", "AAAAAAA", "BBBBBBB", "CFDGT");
        Assertions.assertEquals("ZZZZ", Functions.maxObject.execute(strings));
    }

    class Cat {
        String name;
        int age;

        public Cat(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Cat cat = (Cat) o;
            return age == cat.age &&
                    Objects.equals(name, cat.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }

        @Override
        public String toString() {
            return "Имя: " + name + ", Возраст " + age;
        }
    }
}
