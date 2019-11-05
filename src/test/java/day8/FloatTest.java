package day8;

import org.junit.Test;

public class FloatTest {

    @Test
    public void testFloatSum(){
        double thisIsFloat = 0.1 + 0.2;
        System.out.println(thisIsFloat);
        System.out.println(String.format("%.2f",thisIsFloat));
    }
}
