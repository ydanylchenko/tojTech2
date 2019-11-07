package day8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FloatTest {

    @Test
    public void testFloatSum() {
        double thisIsFloat = 0.1 + 0.2;
        System.out.println(thisIsFloat);
        System.out.println(String.format("%.2f", thisIsFloat));
        assertEquals(0.3, thisIsFloat, 0.0000000000000001);
        assertNotEquals(0.3, thisIsFloat, 0);
        assertEquals(0.125, 0.125, 0);
    }
}
