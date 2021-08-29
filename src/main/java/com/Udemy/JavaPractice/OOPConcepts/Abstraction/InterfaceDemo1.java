package com.Udemy.JavaPractice.OOPConcepts.Abstraction;

import com.Udemy.JavaPractice.OOPConcepts.InterfaceDemo;

public class InterfaceDemo1 {
    public static void main(String[] args) {
        CarsInterface myInterface = new InterfaceDemo();
        myInterface.engineStart("6 Cyl", true);
        // if we run the test, the output is "this is the implementation", bcs we printed it in the InterfaceDemo
    }
}

