package day15.homeWork;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ArithmeticAverageTest {
    /**
     * https://en.wikipedia.org/wiki/Average
     * "average" refers to the arithmetic mean, the sum of the numbers divided by how many numbers are being averaged.
     * @param digits array
     * @return the average of the digits array
     */
    public static double getAverage(double[] digits) {
        double average = 0;
//        Implementation goes here.
//        TIP_0 Average is sum of all the array elements divided by their amount
//        In order to find the sum of elements we need to define and initialize double variable that will hold the sum value
//        and then iterate over all the elements in the array increasing the sum variable by the value of the current element
//        amount of elements in the array is stored in the length field of the digits array
//        and then we are assigning the result of sum by elements amount division to average variable

        return average;
    }

    @Test
    public void positiveDigitsTest() {
        double[] digitsArray = new double[]{1.0, 9.0};
        assertEquals(5.0, getAverage(digitsArray), 0);
    }

    @Test
    public void negativeDigitsTest() {
        double[] digitsArray = new double[]{-5.0, 5.0};
        assertEquals(0.0, getAverage(digitsArray), 0);
    }

    @Test
    public void floatingPointTest() {
        double[] digitsArray = new double[]{1.0, 3.0, 6.0};
        assertEquals(3.3333, getAverage(digitsArray), 0.0001);
    }

    @Test
    public void zeroTest() {
        double[] digitsArray = new double[]{0.0, 0.0, 0.0};
        assertEquals(0.0, getAverage(digitsArray), 0);
    }

    @Test
    public void singleDigitTest() {
        assertEquals(6.0, getAverage(new double[]{6.0}), 0);
        assertEquals(Double.MAX_VALUE, getAverage(new double[]{Double.MAX_VALUE}), 0);
        assertEquals(Double.MIN_VALUE, getAverage(new double[]{Double.MIN_VALUE}), 0);
    }
}
