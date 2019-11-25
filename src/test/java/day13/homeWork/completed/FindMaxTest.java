package day13.homeWork.completed;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class FindMaxTest {
    /**
     * @param digits array of digits
     * @return the maximal digit from the digits array
     */
    public static int getMaxDigit(int[] digits) {
        int maxDigit = Integer.MIN_VALUE;
//        Implementation goes here
//        ALGORITHM: We need to iterate over the digits array and compare the value on current iteration with the current maxDigit.
//        If current value is bigger we assign current iteration value to maxDigit variable (maxDigit value is update with the new value)
        System.out.println("We are iterating over: " + Arrays.toString(digits));
        for (int digit : digits) {
            System.out.println("digit value on current iteration is: " + digit);
            System.out.println("maxDigit value on current iteration is: " + maxDigit);
            boolean isCurrentDigitBiggerThenMaxDigit = digit > maxDigit;
            System.out.println("is digit bigger then maxDigit? " + isCurrentDigitBiggerThenMaxDigit);
            if (isCurrentDigitBiggerThenMaxDigit) {
                System.out.println("we assign current iteration digit value to maxDigit variable");
                System.out.println("maxDigit was: " + maxDigit);
                maxDigit = digit;
                System.out.println("maxDigit now: " + maxDigit);
            } else {
                System.out.println("maxDigit remains" + maxDigit + " as it's bigger then current digit");
            }
        }
        System.out.println("After iterating over all the digits array elements we get the maxDigit=" + maxDigit);
//        we return the maxDigit value as result of this method execution to the place that called this method
        return maxDigit;
    }

    @Test
    public void singleElementArrayTest() {
        int[] digitsArray = new int[]{126};
        assertEquals(126, getMaxDigit(digitsArray));
    }

    @Test
    public void positiveDigitsArrayTest() {
        int[] digitsArray = new int[]{0, 12, 1, 3, 5};
        assertEquals(12, getMaxDigit(digitsArray));
    }

    @Test
    public void negativeDigitsArrayTest() {
        int[] digitsArray = new int[]{-1, -12, -45, -6};
        assertEquals(-1, getMaxDigit(digitsArray));
    }

    @Test
    public void mixedDigitsArrayTest() {
        int[] digitsArray = new int[]{-1, -12, 12, 5, -45, -6};
        assertEquals(12, getMaxDigit(digitsArray));
    }
}
