package day9.homeWork.completed.doWhileLoop;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumCalculator {
    //    each of the tests is passing it's own maxValue (0,1,2,3,4 and 15). This passed value is stored into the maxValue
//    variable so that we can use it in the loop statement
    public int calculateSum(int maxValue) {
//        This variable will hold sum of all the digits. We define it and initialize with 0 value
        int sum = 0;
        System.out.println("sum before the loop is: " + sum);
//        as while (and doWhile) doesn't have counter available, we need to define it separately.
//        It will start with 0 but having it starting with 1 will not make any difference
        int currentIterationDigitValue = 0;
//        this do {} section will execute at least once even if currentIterationDigitValue <= maxValue = FALSE . Debug the testSumOfNegatives() test
        do {
            System.out.println("loop condition was evaluated to true so that we are executing the code in the loop");
            System.out.println("sum on start of current iteration is: " + sum);
            System.out.println("current value of currentIterationDigitValue is: " + currentIterationDigitValue);
            sum = sum + currentIterationDigitValue;
            System.out.println("sum at the end of current iteration is: " + sum);
//            we do also need to increase out counter because while (and doWhile) loops do not provide it as FOR loop
            currentIterationDigitValue = currentIterationDigitValue + 1;
        } while (currentIterationDigitValue <= maxValue);
        System.out.println("sum after the loop is: " + sum);
//        we are returning the value stored in sum variable as the result of method execution
        return sum;
    }

    @Test
    public void testSumOfNegatives() {
        assertEquals(0, new SumCalculator().calculateSum(-5));
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
