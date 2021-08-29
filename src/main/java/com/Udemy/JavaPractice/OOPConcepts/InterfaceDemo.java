package com.Udemy.JavaPractice.OOPConcepts;

import com.Udemy.JavaPractice.OOPConcepts.Abstraction.BMWCarsInterface;
import com.Udemy.JavaPractice.OOPConcepts.Abstraction.CarsInterface;

public class InterfaceDemo implements CarsInterface, BMWCarsInterface {
    @Override
    public void engineStart(String engineStart, boolean isKeyLess) { //  creation of the interface
        System.out.println("this is the implementation"); // implementation of the interface

    }

    @Override
    public void headUpNavigation() {
        System.out.println("This is the headUpNavigation");
    }
}
/*need to use the keyword implements and give the name of the interface. while overriding it added just the body for us
 to implement. the class doesn't need to implement the declared variables in the interface. Our declared variable in the
  interface "public String speed = "100"; but the class didn't do anything with the method. Class deals only with methods
  implementation. All the variables defined in the interface would eb public anyways. But it is better to have variables
  inside the class, JMO
  No we need to create an object of the class that will implement the interface. We created a class InterfaceDemo1*/
