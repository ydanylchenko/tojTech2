package day15.homeWork;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseNumber {
    /**
     * This method reverses digit
     *
     * @param digit
     * @return reversed digit
     */
    public static int getReversedDigit(int digit) {
        int reversedDigit = digit;
//        Implementation goes here.
        return reversedDigit;
    }

    @Test
    public void positiveDigitTest() {
        assertEquals(1, getReversedDigit(1));
        assertEquals(321, getReversedDigit(123));
    }

    @Test
    public void negativeDigitTest() {
        assertEquals(1, getReversedDigit(-1));
    }

    @Test
    public void zeroTest() {
        assertEquals(0, getReversedDigit(0));
    }

    @Test
    public void bigValueTest() {
        assertEquals(76723, getReversedDigit(Short.MAX_VALUE));
    }

    @Test
    public void smallValueTest() {
        assertEquals(86723, getReversedDigit(Short.MIN_VALUE));
    }
}
