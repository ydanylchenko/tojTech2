package day15.homeWork;

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
        if (digit%2==0){
            isEven=true;
            System.out.println("The number is even.");
        }
        else{
            isEven=false;
            System.out.println("The number is odd.");
        };
//        Implementation goes here.
/*  TIPS_0: The method is supposed to check if provided as argument digit is even or odd.
There's no point in checking of both "if digit divides by two without leftover and if digit divides by two with leftover" conditions
because if case if the digit is even then it's not odd and vice versa.
This is the reason why this method is called isEven() as if the digit is even it should return TRUE and if it's odd it will return FALSE
this ^^ is a common technique for the mutual exclusion scenarios. E.g. you have two platforms in your application: desktop and mobile,
 the method that will tell you which platform you are using will be called either isDesktop() or isMobile() but there will be just one of them
 as keeping both is redundant
 */
/*
    TIPS_1: In order to find if the digit is divided by two without leftover we need to find the leftover first.
    The best way to find the remainder is using mathematical operator modulus: https://en.wikipedia.org/wiki/Modulo_operation
 Example usage is available here: http://www.cs.ukzn.ac.za/~hughm/java/intro/week2/21.html
 But it can also be complemented without '%' operator with simple math commands: '-', '*' and '/';
 */
/*
    TIPS_2: the fact of being even will be decided basing of the fact if the remainder is 0 (i.e. the digit is even) and we need to return true
    in all the other non-zero cases of remainder value the digit is odd and we need to return false value
 */
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
