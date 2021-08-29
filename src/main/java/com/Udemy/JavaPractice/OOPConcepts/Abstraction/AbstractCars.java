package com.Udemy.JavaPractice.OOPConcepts.Abstraction;

/* Abstraction is used to hide implementation inside a class from the user(other class), showing it the functionality/
methods. In JAVA we can achieve abstraction in 2 ways: oneis abstract classes and another is interface.
 when we add the abstract keyword, it became the abstract class. Abstract class can contain abstract methods and when
* we define abstract methods, we need to use the abstract keyword. But it is not mandatory to have an abstract method, it
* can have non-abstract methods as well. But if a class has an abstract method, then the class MUST BE ABSTRACT!
* So my abstract class may or may not have an abstract method, but of there is a single abstract in the class, my class
* has to eb ABSTRACT!
* Abstract Class LIMITATION: We can't instantiate abstract classes, meaning we cant create an object of the abstract class
* We CAN EXTEND Abstract Classes and begin to use all the methods available in abstract classes in the child class.
* If we inherit abstract classes, we have to provide implementation.
To use abstract classes, we have to inherit them by using extend
*   */
public abstract class AbstractCars {
    private int privateSpeed;
    public int  publicSpeed;
    protected int protectedSpeed;
    int speedLimit = 100;
    public AbstractCars(){
        this (0);
    }
    public AbstractCars (int startSpeed){
        this.privateSpeed=startSpeed;
    }

    public void setPrivateSpeed(int privateSpeed) {
        this.privateSpeed = privateSpeed;
    }
    public abstract void engineStart (String keyType, int numbOfCyl); //// we declared the method as abstract. By declaring the method as abstract, the
    // System.out.println("Engine is started"); // method has signature only,  but not the body. we don't need curly braces
    // any class that will inherit the AbstractCars class, will HAVE TO implement the abstract methods: whatever is declared,
    // the classes have to define those abstract methods inside themselves and implement the functionality.

}


