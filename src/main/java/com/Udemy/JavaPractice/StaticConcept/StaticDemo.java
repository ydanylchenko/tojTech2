package com.Udemy.JavaPractice.StaticConcept;

import com.Udemy.JavaPractice.StaticConcept.StaticVariablesClass;

public class StaticDemo {
    public static void main(String[] args) {
        StaticVariablesClass c1 = new StaticVariablesClass("bmw");
        System.out.println("the make of the car is " + c1.getMake());
        System.out.println("the instance number is " + c1.getInstanceNum());

        StaticVariablesClass c2 = new StaticVariablesClass("audy");
        System.out.println("the make of the car is " + c2.getMake());
        System.out.println("the instance number is " +StaticVariablesClass.getInstanceNum());
        // we can change c2 for StaticVariablesClass, also declaring public int getInstanceNum() as public static int getInstanceNum()

        /*we ran the code, the instance of the 2 object is 1 but it is supposed to be 2. This is bcz the field variables of the class always
        belong to the object. It refers to 0 incrementing by 1. It does the same for the 2 object.
        if we want to attache smthing to the class, we need to define it as static. so we have declared
        private int instanceNum = 0 as  private static int instanceNum = 0;
        When we made the variable as static, the variable is now a class variable and not the object variable
        If we declare any variable as static, it is known as static variable and it is used to refer to the common properties
        of all the objects
        Same we do with the variable- private static int wheelsCount = 4, as we assume that the number of wheels doesn't change
        with the type object of a car. How it helps - it will have only one copy in the memory at the time of class loading,
        whether we are accessing them from 2 different objects, both objects are accessing one single cope. So it saves memory and
        execution time
*/
    }
}
