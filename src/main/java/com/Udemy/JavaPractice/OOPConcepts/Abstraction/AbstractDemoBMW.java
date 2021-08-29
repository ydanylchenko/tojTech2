package com.Udemy.JavaPractice.OOPConcepts.Abstraction;

public class AbstractDemoBMW extends AbstractCars{
    public void setPrivateSpeed(int speed) {
        super.setPrivateSpeed(10);
    }

    @Override
    public void engineStart(String keyType, int numbOfCyl) {

    }


   /* public void engineStart() {
        super.engineStart();
        System.out.println("BMWs have keyless engine start");*/

}
