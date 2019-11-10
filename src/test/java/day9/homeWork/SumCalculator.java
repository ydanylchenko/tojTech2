package day9.homeWork;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumCalculator {
    public int calculateSum(int maxValue) {
        int sum = 0;
//        YOUR CODE GOES HERE
        return sum;
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
    }
}
