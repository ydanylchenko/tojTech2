package day15.homeWork.completed.parity.v1_ifElse;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParityTest {
    /**
     * https://en.wikipedia.org/wiki/Parity_(mathematics)
     * An integer is even if it is divisible by two and odd if it is not even
     *
     * @param digit
     * @return true if the digit is even or else returns false
     */
    public static boolean isEven(int digit) {
        boolean isEven = false;
        System.out.println("Is " + digit + " even?");
        if (digit % 2 == 0) {
            isEven = true;
            System.out.println("The number is even.");
        } else {
            isEven = false;
            System.out.println("The number is odd.");
        }
        return isEven;
    }

    @Test
    public void positiveDigitTest() {
        assertEquals(false, isEven(1));
    }

    @Test
    public void negativeDigitTest() {
        assertEquals(false, isEven(-1));
    }

    @Test
    public void zeroTest() {
        assertEquals(true, isEven(0));
    }

    @Test
    public void maxIntegerValueTest() {
        assertEquals(false, isEven(Integer.MAX_VALUE));
    }

    @Test
    public void minimalIntegerValueTest() {
        assertEquals(true, isEven(Integer.MIN_VALUE));
    }
}
