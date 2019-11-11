package day9.homeWork.completed.forLoop;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumCalculator {
    //    each of the tests is passing it's own maxValue (0,1,2,3,4 and 15). This passed value is stored into the maxValue
//    variable so that we can use it in the loop statement
    public int calculateSum(int maxValue) {
//        This variable will hold sum of all the digits. We define it and initialize with 0 value
        int sum = 0;
        System.out.println("sum before the loop is: " + sum);
//        the i variable is out counter, it starts with 0 and after each iteration it's increased by one with i++ call
//        note that i is variable name, i.e. we can rename it to anything else, e.g. currentIteration.
//        In this case the loop will look like for (int currentIteration = 0; currentIteration <= maxValue; currentIteration++)
//        and in the body of loop we will have to use the currentIteration instead of i
//        If (i <= maxValue)=false, e.g. this method is called with maxValue that is less then 0 (-5) the code in loop will not be executed. Debug the testSumOfNegatives() test
        for (int i = 0; i <= maxValue; i++) {
            System.out.println("loop condition was evaluated to true so that we are executing the code in the loop");
            System.out.println("sum on start of current iteration is: " + sum);
            System.out.println("current value of i is: " + i);
            sum = sum + i;
            System.out.println("sum at the end of current iteration is: " + sum);
        }
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
