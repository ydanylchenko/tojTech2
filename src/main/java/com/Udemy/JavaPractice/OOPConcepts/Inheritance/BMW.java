package com.Udemy.JavaPractice.OOPConcepts.Inheritance;

public class BMW extends Cars {

    public BMW(int startSpeed) {
        super(startSpeed);// use super to access the super class to utilize the constructor. now we need to override
        // the functionality of the methods in the super (Cars) class

    }
    @Override
    public void increaseSpeed() {
        System.out.println("Increasing speed of BMW");
    }

    public void headsUpDisplayNavigation(){
        System.out.println("Specific BMW Functionality");
    }


}
