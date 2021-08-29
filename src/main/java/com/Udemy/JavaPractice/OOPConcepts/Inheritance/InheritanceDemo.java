package com.Udemy.JavaPractice.OOPConcepts.Inheritance;

public class InheritanceDemo {
    public static void main(String[] args) {
        int speed = 0;
        Cars c1 = new Cars (speed);
        c1.increaseSpeed();
        BMW bmw1 = new BMW(speed);
        bmw1.decreaseSpeed();
        bmw1.headsUpDisplayNavigation();
    }
}
//child class can inherit functionality of the parent class, but parent class cant utilize the child class methods.
