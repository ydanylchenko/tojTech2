package com.Udemy.JavaPractice.OOPConcepts.Inheritance;

public class

Cars {
    int speed;
    public Cars (int startSpeed){
        speed=startSpeed;

    }

    public void increaseSpeed() {
        speed++;
        System.out.println("Increasing speed");

    }

    public void decreaseSpeed() {
        speed--;
        System.out.println("Decreasing speed");
    }

}
