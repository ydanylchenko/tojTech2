package com.Udemy.JavaPractice;

import org.openqa.selenium.json.JsonOutput;

public class Random {
    public static void main(String[] args) {

        String x = "Hello";   //TO SWAP WORDS
        String y = "Welcome";
        x = x + y; //HelloWelcome
        y = x.substring(0, (x).length() - y.length());
        x = x.substring(y.length());
        System.out.println(x);
        System.out.println(y);

        String a = "My name is Kate";
        StringBuffer sb = new StringBuffer(a);
        System.out.println(sb.reverse());

        String string = "This is my first interview";
        String reversed = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            reversed = reversed + string.charAt(i);
        }
        System.out.println("My reversed String is: " + reversed);


        String str = "Today is Sunday";
        String reverse = "";
        String[] array = str.split(" ");
        for (int i = array.length - 1; i >= 0; i--) {
            reverse = reverse + array[i]+" ";
        }
        System.out.println(reverse);
    }

}

