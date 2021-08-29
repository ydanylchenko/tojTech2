package com.Udemy.JavaPractice;

public class ClassDemo {
    public static void main(String[] args) {
        Car Audi = new Car(); // creating and initializing an object of the class
        Audi.setMake("Audi");
        System.out.println("Make of Ausi is: " + Audi.getMake());

        Car BMW = new Car ();
        BMW.setModel("c300");
        System.out.println("Model of BMW is: "  + BMW.getModel());

        BMW.setYear(2005);
        System.out.println("Year of BMW is: " + BMW.getYear());

        //BMW.setColor("");
        System.out.println("Color of BMW is: " + BMW.getColor()); // we never defined a color, which is why it is
        // Null by default. String value by default is Null.



    }

}
