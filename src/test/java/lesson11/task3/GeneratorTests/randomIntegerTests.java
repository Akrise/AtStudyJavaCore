package lesson11.task3.GeneratorTests;

import homework_solution.lesson11.task3.Generator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class randomIntegerTests {

    @Test
    public void tenThousandRandomValuesTest(){
        Random random = new Random();
        int start = 0;
        int end = 0;
        int result = 0;
        for (int i = 0; i < 10_000; i++) {
            start = random.nextInt(Integer.MAX_VALUE);
            end = random.nextInt(Integer.MAX_VALUE-start)+ start;
            result =  Generator.randomInteger(start, end);
            Assertions.assertTrue(result <= end && result > start);
        }
    }
}
