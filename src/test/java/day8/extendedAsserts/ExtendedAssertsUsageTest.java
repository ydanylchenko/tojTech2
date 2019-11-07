package day8.extendedAsserts;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertNotEquals;

public class ExtendedAssertsUsageTest {
    @Test
    public void assertsEqualsNotEqualsUsageTests() {
        String expectedText = "thisIsExpectedText";
        String actualTextSameAsExpectedText = expectedText;
        String notTheExpectedText = "thisIsNotTheExpectedText";

        assertEquals(expectedText, actualTextSameAsExpectedText);
        assertNotEquals(expectedText, notTheExpectedText);
    }

    @Test
    public void assertsTrueFalseTests() {
        boolean itIsTrue = 5 == 5;
        boolean itIsFalse = 23 < 5;
//        It's the same as:
        assertEquals(true, itIsTrue);
        assertNotEquals(true, itIsFalse);
        assertEquals(false, itIsFalse);
        assertNotEquals(false, itIsTrue);
//        Can be simplified to:
        assertTrue(itIsTrue);
        assertFalse(itIsFalse);
//        Without separate definition of condition:
        assertTrue(5 == 5);
        assertFalse(23 < 5);
    }
}
