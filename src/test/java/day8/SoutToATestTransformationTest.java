package day8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SoutToATestTransformationTest {
    @Test
    public void myISuckAtJavaPositive() {
//        What java does when you are writing the following command:
        System.out.println("50 results".substring(0, 2));
//        1. String object with "50 results" value is created
//        2. substring method is executed on the object created in point 1 so that we get the result value "50"
//        3. the result of point 2 is printed to terminal with call of System.out.println

//        This one line can be split into 3 lines in order to show each step of the text transformation
        String text = "50 results";                 // Point 1
        String updatedText = text.substring(0, 2);  // Point 2
        System.out.println(updatedText);            // Point 3

//        We need to verify the result of execution of substring method, i.e. we
//        need to replace point 3 with verification method call instead of printing to terminal output
//        The verification methods are asserts, i.e. assertEquals, assertNotEquals, assertTrue etc.
//        We keep the first two steps in the same way:
        String myText = "50 results";
        String myUpdatedText = text.substring(0, 2);
//        Additionally we define and initialize the expected value
        String myExpectedResult = "50";
//        And instead of the sout we put comparison
        assertEquals(myExpectedResult, myUpdatedText);

//        Putting everything in one line would give us the following:
        assertEquals("50", "50 results".substring(0, 2));
    }
}
