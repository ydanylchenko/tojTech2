package com.Udemy.JavaPractice.String;

import org.openqa.selenium.json.JsonOutput;

import java.lang.reflect.Array;

public class ReverseString1 {
    public static void main(String[] args) {
        String input = "This is a test String";
        String output = reverse(input);
        System.out.println(output);

    }

    private static String reverse(String input) {
        String reverse="";
        if (input.isEmpty() || input==null){
            System.out.println("Empty and Null Strings are not accepted");
        }
        if (input.length()<=1){ // we checking for the length. if this is only a single character, we return the same input
            reverse=input;
        } else{  // if not a single character, we tak in to Array, split with the spaces, iterate over the Array and add into the reverse
            String[] originalArray = input.split("\\s+"); // s is for the space, its gonna split the string on spaces,
            // but it is gonna fail if there are too many spaces bw the words, for that we will use +. So its gonna split
            // the string and put into the originalArray

            for (String item:originalArray){ // this, is, a test, string
                reverse=item + " " + reverse; // while iterating it will return: this + "", is + this, a + is this,
                // test + a is this, string + test a is this. We are adding double quotes and a space to have a space
                // bw the words

            }

        }

        return reverse.trim(); // trim - removing white spaces from a  string variable
    }

}

/* 1 check if the length of the string > is greater than 1
            if (input.length()<=1){
            reverse=input;
   2 we want to check is the string isEmpty
            if (input.isEmpty() || input==null){
            System.out.println("Empty and Null Strings are not accepted");
            if we do:   String input = ""; //"This is a test String", the output will be
            -Empty and Null Strings are not accepted*/
