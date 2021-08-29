package com.Udemy.JavaPractice.StaticConcept;

public class StaticVariablesClass {
    //static is always associated with class and not with the object
    private static int wheelsCount = 4;
    private String make;
    private static int instanceNum = 0; // number of instances created for the class

    public StaticVariablesClass(String make){ // created constructor for the class
     this.make=make;
     instanceNum ++; // incrementing
    }

    public String getMake() {
        return make;
    }
    public static int getInstanceNum(){
        return instanceNum;
}
    }

