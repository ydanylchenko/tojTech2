package com.Udemy.JavaPractice.String;

import java.util.Scanner;

public class ReverseStringCharacters {
    public static void main(String[] args) {
// Scanner is a class in java. util package used for obtaining the input of the primitive types like int,
// double, etc. and strings. It is the easiest way to read input in a Java program
        Scanner scan = new Scanner(System.in); // to show in our console we write System.in
        System.out.println("Please enter a string: ");
        String original = scan.nextLine();

        while (original.isEmpty() || original == null) {
            System.out.println("Please enter a valid string, empty and null strings are not accepted:");
            original = scan.nextLine();
        }
        scan.close();

        ReverseChars output = new ReverseChars();
        //String reverseCharacters = output.reverseCharacters(original);
        //System.out.println(reverseCharacters);
    }

    private String reverseCharacters(String originalString) {
        String reverse = "";

        for (int i = originalString.length() - 1; i >= 0; i--) {
            reverse = reverse + originalString.charAt(i);
        }
        return reverse;
    }

    private static class ReverseChars {
    }
}


       /* String originalString = "this is a string";
        String reverseString = "";
        for (int i = originalString.length()-1; i>=0; i--){ // we start from the end -1, as length gives us the complete string
            reverseString=reverseString+originalString.charAt(i);
        }
        System.out.println(reverseString);
        if(originalString==reverseString){

        }*/


