package day9.homeWork.completed.whileLoop;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumCalculatorTest {

    @Test
    public void testSumOfNegatives() {
        SumCalculator sumCalculator = new SumCalculator();
        assertEquals(0, sumCalculator.calculateSum(-5));
    }

    @Test
    public void testSumOfZero() {
        assertEquals(0, new SumCalculator().calculateSum(0));

    }

    @Test
    public void testSumOfOne() {
        assertEquals(1, new SumCalculator().calculateSum(1));
    }

    @Test
    public void testSumOfTwo() {
        assertEquals(3, new SumCalculator().calculateSum(2));
    }

    @Test
    public void testSumOfThree() {
        assertEquals(6, new SumCalculator().calculateSum(3));
    }

    @Test
    public void testSumOfFour() {
        assertEquals(10, new SumCalculator().calculateSum(4));
    }

    @Test
    public void testSumOfOneTwenty() {
        assertEquals(120, new SumCalculator().calculateSum(15));

        SumCalculator calculator;
        calculator = new SumCalculator();
        int expectedResult;
        expectedResult = 120;
        int testValue;
        testValue = 15;
        int actualResult;
        actualResult = calculator.calculateSum(testValue);
        assertEquals(expectedResult, actualResult);
    }
}
