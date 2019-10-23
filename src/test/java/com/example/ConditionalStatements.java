package com.example;

public class ConditionalStatements {
    public static void main(String[] args) {
        int digit = (int) (Math.random() * 10);
        System.out.println("Original digit: " + digit);
        if (digit > 6) {
            System.out.println("Digit is more than 10");
        } else if (digit < 3) {
            System.out.println("Digit is less then 2");
        } else {
            System.out.println("Nothing shoud be done");
        }

    }
}
