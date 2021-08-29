package com.Udemy.JavaPractice.StaticConcept;

public class StaticKeynotesDemo {

   /* There are two main restrictions for static method.
   1. Static method cant use non-static variable or method directly. to access them, we have to create an object within
    the same method. Class variables and methods done really exist until the class is executed/loaded in the JVM and the
    instance is created. So, once the class is loaded and the instance of the class in created, until this point that
    main method cant call the class variable(s) or method(s). unless the class is executed, there is no instance and if there
    is no instance, the non-static fields and methods cant be called in the main method. That's the reason of this limitation
    and it call call only static methods or variables.

   2. This and Super keywords can't be used in static context.
    */
   public int addNum = 10;
    public static int addNumStatic = 10;

    public static void main(String[] args) {
        StaticKeynotesDemo s1 = new StaticKeynotesDemo(); // created an object
        int output = s1.sum(20);
        int staticOutput = sumStatic(10);
        System.out.println("The output is: " + output);
        System.out.println("The output is: " + staticOutput);
    }

    public int sum(int num) {
        return num + addNum;
    }

    public static int sumStatic(int num) {
        return num + addNumStatic;
    }
}

