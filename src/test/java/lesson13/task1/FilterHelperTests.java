package lesson13.task1;

import homework_solution.lesson13.task1.FilterHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FilterHelperTests {

    @Test
    public void lessThenFiveTest() {
        List<Integer> inputList = Arrays.asList(-20, 0, 4, 5, 7, 9);
        List<Integer> expectedList = Arrays.asList(-20, 0, 4);
        Assertions.assertEquals(expectedList, FilterHelper.filterIntegers(inputList, x -> x < 5));
    }

    @Test
    public void moreThenTenTest() {
        List<Integer> inputList = Arrays.asList(-20, 0, 4, 5, 7, 9, 10, 15, 25);
        List<Integer> expectedList = Arrays.asList(15, 25);
        Assertions.assertEquals(expectedList, FilterHelper.filterIntegers(inputList, x -> x > 10));
    }

    @Test
    public void containedInArrayTest() {
        List<Integer> inputList = Arrays.asList(-20, 0, 4, 5, 7, 9, 10, 15, 25);
        List<Integer> expectedList = Arrays.asList(-20, 4, 9, 15);
        List<Integer> etalon = Arrays.asList(-20, 4, 9, 12, 15);
        Assertions.assertEquals(expectedList, FilterHelper.filterIntegers(inputList, x -> etalon.contains(x)));
    }

    @Test
    public void singleValuesTest() {
        List<Integer> inputList = Arrays.asList(-10, -7, 5, 15, 5, -2, 4, 15);
        List<Integer> expectedList = Arrays.asList(-10, -7, -2, 4);
        Assertions.assertEquals(expectedList, FilterHelper.filterIntegers(inputList, x -> {
            {
                List<Integer> uniques = new LinkedList<>(inputList);
                uniques.remove(x);
                return !uniques.contains(x);
            }
        }));
    }
}
