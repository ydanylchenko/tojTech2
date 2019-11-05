package day8;

import org.junit.Assert;

public class StringFormatUsages {
    public static void main(String[] args) {
//        Use %s placeholder for any primitive
        System.out.println(String.format("Print me '%s' value", "Amar"));   // Put String value in the middle of text
        System.out.println(String.format("Print me '%s' value", 15));   // Put digit in the middle of text
        System.out.println(String.format("Print me '%s' value", 12.34));    // Put digit with floating point in the middle of text
        System.out.println(String.format("Print me '%s' value", true)); // Put boolean in the middle of text
        System.out.println(String.format("Print me |%s| value", 'K'));  // Put character in the middle of text
        String result = String.format("Print me |%s| value", 'K');
        System.out.println(result);
        Assert.assertEquals("Print me |K| value", result);  // Put character in the middle of text

//        Use %f placeholder only for digits with floating point. It will produce Runtime error on try to use it with not float digit
        System.out.println(String.format("Print me '%f' float value", 12.34));   // Put digit with floating point in the middle of text

//        Use %d placeholder only for digits without floating point
        System.out.println(String.format("Print me '%d' digit", 15));    // Float value

//        Use multiple placeholder in the format:
        System.out.println(String.format("My name is %s. I'm %d feet tall and I know that PI=%f", "Bilbo", 5, 12.34));

//        Most common formatting options:
//        Put a digit between % and placeholder char in order to specify the length of text.
        System.out.println("Without length formatting");
        System.out.println(String.format("Print me '%s' value", "A"));
        System.out.println(String.format("Print me '%s' value", "AB"));
        System.out.println(String.format("Print me '%s' value", "ABC"));
        System.out.println(String.format("Print me '%s' value", "ABCD"));
        System.out.println("With length formatting");
        System.out.println(String.format("Print me '%5s' value", "A"));
        System.out.println(String.format("Print me '%5s' value", "AB"));
        System.out.println(String.format("Print me '%5s' value", "ABC"));
        System.out.println(String.format("Print me '%5s' value", "ABCD"));
        System.out.println(String.format("Print me '%5s' value", "YZ"));
        System.out.println("Without length formatting");
        System.out.println(String.format("Print me '%d' value", 8));
        System.out.println(String.format("Print me '%d' value", 9));
        System.out.println(String.format("Print me '%d' value", 10));
        System.out.println(String.format("Print me '%d' value", 11));
        System.out.println("With length formatting");
        System.out.println(String.format("Print me '%3d' value", 8));
        System.out.println(String.format("Print me '%3d' value", 9));
        System.out.println(String.format("Print me '%3d' value", 10));
        System.out.println(String.format("Print me '%3d' value", 11));
//        Put a dot and a digit between % and float placeholder in order to specify precision (amount of decimal points) for float
        System.out.println("Without length formatting");
        System.out.println(String.format("Print me '%f' value", 0.10000));
        System.out.println(String.format("Print me '%f' value", 0.12000));
        System.out.println(String.format("Print me '%f' value", 0.12300));
        System.out.println(String.format("Print me '%f' value", 0.12345));
        System.out.println("With length formatting");
        System.out.println(String.format("Print me '%.9f' value", 0.10000));
        System.out.println(String.format("Print me '%.9f' value", 0.12000));
        System.out.println(String.format("Print me '%.9f' value", 0.12300));
        System.out.println(String.format("Print me '%.9f' value", 0.12345));
//        It can also do rounding of float for you
        System.out.println(String.format("Rounding of '%f' with one decimal point gives '%.1f' value", 0.13, 0.13));
        System.out.println(String.format("Rounding of '%f' with one decimal point gives '%.1f' value", 0.14, 0.14));
        System.out.println(String.format("Rounding of '%f' with one decimal point gives '%.1f' value", 0.149, 0.149));
        System.out.println(String.format("Rounding of '%f' with one decimal point gives '%.1f' value", 0.15, 0.15));
        System.out.println(String.format("Rounding of '%f' with one decimal point gives '%.1f' value", 0.151, 0.151));
        System.out.println(String.format("Rounding of '%f' with one decimal point gives '%.1f' value", 0.199, 0.199));
        System.out.println(String.format("Rounding of '%f' with one decimal point gives '%.1f' value", 0.2, 0.2));
//        And length can be mixed with precision by setting both parameters %LENGTH.PRECISIONf
        System.out.println(String.format("Just the digit: \t'%f',\nnow with length:\t'%10f',\nnow with precision\t'%.3f',\nnow all together\t'%10.3f'", 0.345678, 0.345678, 0.345678, 0.345678));
    }
}
