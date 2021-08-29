package com.Udemy.JavaPractice;

import org.openqa.selenium.json.JsonOutput;

public class CarSampleForConstructorDemo {
    private String make;
    int speed; // defined a speed variable
    int gear;// defined a gear variable

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public CarSampleForConstructorDemo() { // this is default no argument constructor. it doesn't change anything
        this(10,2); // we can call a constructor within a constructor using "this keyword"
        this.speed = 0; // we setting default value for speed inside the constructor
        this.gear = 0;// we setting default value for gear inside the constructor
        // when we created an object "Car c1 = new Car" of my class, we will get these values by default.
        System.out.println("executing constructor without arguments");
    }

    public CarSampleForConstructorDemo (int speed, int gear){ // we created the second object passing the values
      this.speed = speed;
      this.gear= gear;
        System.out.println("executing constructor with arguments");

    }

}
