package day7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class StringInteractionTests {
    @Test
    public void stringTests() {
        assertEquals("aaaccc", "aaa".concat("ccc"));
        assertNotEquals("aaaccc", "aaa".concat("ccc").concat("eee"));
    }
}
