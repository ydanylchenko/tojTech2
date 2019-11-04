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

    @Test
    public void assertsNullNotNullTests() {
//        Given CreepyCreature class with 4 fields. As they are not defined by default they will get the default values on object creation
        CreepyCreature creature = new CreepyCreature();
        System.out.println(String.format("This is a creature with the following fields values:\nageAsInt: %s \nweightAsFloat: %s \nisAliveAsBoolean: %s \nnameAsString: %s",
                creature.ageAsInt, creature.weightAsFloat, creature.isAliveAsBoolean, creature.nameAsString));
//        Let's verify things
        assertEquals(null, creature.nameAsString);
        assertNull(creature.nameAsString);
        creature.nameAsString = "Pedro!";
        System.out.println(String.format("This is a creature with the following fields values:\nageAsInt: %s \nweightAsFloat: %s \nisAliveAsBoolean: %s \nnameAsString: %s",
                creature.ageAsInt, creature.weightAsFloat, creature.isAliveAsBoolean, creature.nameAsString));
        assertNotEquals(null, creature.nameAsString);
        assertNotNull(creature.nameAsString);
//        Unrelated to assertNull but
        assertEquals(0, creature.ageAsInt);
        assertEquals(0.0, creature.weightAsFloat,0);
        assertEquals(false, creature.isAliveAsBoolean);
        assertFalse(creature.isAliveAsBoolean);
    }
}
