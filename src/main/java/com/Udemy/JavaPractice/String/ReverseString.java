package com.Udemy.JavaPractice.String;

public class ReverseString {

    public static void main(String[] args) {
        String s = "Kate";

        String  t = "";
        for (int i = s.length() - 1; i >= 0; i--)
        {
            t = t + s.charAt(i);
        }
        System.out.println(t);
        if (s==t)
        {

        }

        /* We use Reverse Iteration method. How to check if this is a reverse string? How to compare the output with the s string?
        Defining an integer i starting from 0 till the total length of the string (greater or equals),
        decrementing step be step.
        We will create a new empty string t and pass s string. Using CONCAT (+) pass each letter
        starting from the last index*/

    }
}