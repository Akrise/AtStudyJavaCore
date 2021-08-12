package lesson11.task1;

import homework_solution.lesson11.task1.Calculator;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CalculatorTests {

    @Test
    public void summTwoNumbersTest(){
        Assert.assertEquals( 8, Calculator.summ(5, 3));
    }

    @Test
    public void summSixNumbersTest(){
        Assert.assertEquals(21, Calculator.summ(1,2,3,4,5,6));
    }

    @Test
    public void multiplyTwoNumbersTest(){
        Assert.assertEquals(6, Calculator.multiply(3,2));
    }

    @Test
    public void multiplySixNumbersTest(){
        Assert.assertEquals(720, Calculator.multiply(1,2,3,4,5,6));
    }
}
