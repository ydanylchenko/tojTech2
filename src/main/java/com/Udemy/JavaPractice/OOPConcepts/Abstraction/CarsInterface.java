package com.Udemy.JavaPractice.OOPConcepts.Abstraction;
/* Interfaces are reference types in JAVA and are very similar to a class. It is a collection of Abstract methods.
Abstract methods are the signature of the method, the name and the parameter type what it takes. Abstract method
doesn't have implementation of the method. Lets say we defined an interface and it has all the abstract methods but they
don't have any implementation, so whats the use of it?  Here comes the use! Any class can implement an interface, and classes
that implement the interface they are sort of signing a contract with the interface that "Iam gonna implement all those methods
that you have defined in yourself". So whatever class implements that interface , will be implementing all the methods inside
the interface. This where the interface is in use. Because, by default JAVA doesn't have a concept of multiple inheritance,
interface comes very handy in that, bcz by using multiple interfaces, one class can implement all those interfaces and
define all the methods available in multiple interfaces.
So, other than abstract methods, interfaces can contain constants, variables and so on.  */

public interface CarsInterface { // definition of interface and nothing goes inside it. These methods are going to have
    public String speed = "100"; // implementation in a class, where the interface is going to be implemented.
    public void engineStart(String engineStart, boolean isKeyLess);

    /* IMPLEMENTATION of an INTERFACE. All we need to do is to create a class for that. So a class that implements an
    * interface, should implement all the methods*/
}
