package com.Udemy.JavaPractice;

public class ConstructorDemo {
    /* constructor can be default accepting no parameters, but also there are constructors that can accept values
    in parentheses as methods. Mostly constructors are used to initialize  instance variable values */
    public static void main(String[] args) {
        CarSampleForConstructorDemo c1 = new CarSampleForConstructorDemo ();
        c1.setMake("BMW");
        System.out.println("Make of BMW is: " + c1.getMake());
        System.out.println(c1.gear);
        System.out.println(c1.speed);
        System.out.println("**********");

        CarSampleForConstructorDemo c2 = new CarSampleForConstructorDemo (10,1);
        System.out.println(c2.gear);
        System.out.println(c2.speed);
    }
}
