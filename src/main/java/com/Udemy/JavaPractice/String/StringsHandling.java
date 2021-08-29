package com.Udemy.JavaPractice.String;

public class StringsHandling {
    public static void main(String[] args) {

        /*
        in Java, string is an object that represents a sequence of characters. it is reference data type i JAVA
        There are two ways to create String object:
        1. By string literal - String Constant Pool. It is more customized, we always use this way
        String str = "Payment $100 paid"
        str is a reference to the Object. Object is "Payment $100 paid", we use str to access the object.
        if we create a new reference variable str1 with the same object name "Payment $100 paid", String Constant Pool will
        recognize the same content, it wont create a new object, it will create a new reference, pointing to the same object.
        It is a very good memory utilization
        2. By new keyword - String Object, saved in Heap memory.
        String str = new String "Payment $100 paid"
        if we create a new reference variable str1 with the same object name "Payment $100 paid",a new object will be created,

        The Java String is immutable which means it cannot be changed. Whenever we change any string,
        a new object (instance) is created.

        Lets imagine you came across the text in Selenium - Payment $100 paid. You have to validate the text
        You have to check if $ symbol is presented in the text. There is a String class in JAVA to manipulate
        the strings.
        */

        String str = "Payment $100 paid"; // we defined a class called String. using .(dot) method we getting
        // different methods to manipulate the text which you got placed in the String variable

        System.out.println(str.charAt(6)); // chatAt takes index as an argument. We say 8 and it starts counting from
        //[0] -p[0] a[1] y[2] m[3] e[4] n[5] t[6] [space7] $[8]

                //another option to print $ symbol will be to use indexof()
        String string = "Payments $100 paid";
        System.out.println(string.indexOf("$"));
        System.out.println(string.substring(8)); // indicating the part we want to print our text from by giving the
                                                // index

    }
}
