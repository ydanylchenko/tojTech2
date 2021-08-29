package com.Udemy.JavaPractice.ConditionalStatement;

public class ForLoop {
    public static void main(String[] args) {
      /*  for (int i = 0; i <= 10; i++) {
            System.out.println("The value of i is: " + i);*/

        // for (initialization; boolean expression; update statement (we handle block variable /modify initialized variable));

        //int[] numbers = {10, 20, 30};
        //for (int i = 0; i < numbers.length; i++) {
        //System.out.println("The value of index "  +  i  +  " is " +  numbers[i]);

        int[] numbers = {10, 20, 30};
        for (int number: numbers) { // enhanced for loop
            System.out.println("the value of index is " + number);
        }

        String [] cars = {"audi", "honda", "bmw"};
        for (String car:cars){
            System.out.println("the value of index is " + car );
        }
    }
}


