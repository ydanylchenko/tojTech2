package day15.homeWork.completed.average.v1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArithmeticAverageTest {
    /**
     * https://en.wikipedia.org/wiki/Average
     * "average" refers to the arithmetic mean, the sum of the numbers divided by how many numbers are being averaged.
     *
     * @param digits array
     * @return the average of the digits array
     */
    public static double getAverage(double[] digits) {
        double average = 0;
        double sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += digits[i];
            average = sum / digits.length;
        }
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
