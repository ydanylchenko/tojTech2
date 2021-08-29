package com.Udemy.JavaPractice;

public class Car {

    private String model; // Model - field, member variable; This is in JAVA known as encapsulation, only class can se them
    private String make; // Make -field, member variable;
    private String color; // Color -field, member variable;
    private int year; // Year -field, member variable;

    public void increaseSpeed() {
        System.out.println("increasing the speed");
    }
    //  we will be creating an Object of the Car class, by creating a ClassDemo

    public void setMake (String make) {
        this.make = make; // variables have the same name. if we say make=make without giving this keyword,
        // make will refer to the closest "make" variable is the method. when we use this keyword,make will refer
        // to the class variable.
    }
        public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
        if (year > 2015)
        {
            this.year = year;
            System.out.println("This is the car we want");
        }
        else
            System.out.println("this is the old car");
        }

    }


