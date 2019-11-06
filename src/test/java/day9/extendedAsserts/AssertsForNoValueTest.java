package day9.extendedAsserts;

import org.junit.Test;

import static org.junit.Assert.*;

public class AssertsForNoValueTest {
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
