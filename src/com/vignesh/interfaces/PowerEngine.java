package com.vignesh.interfaces;

public class PowerEngine implements Engine{
    @Override
    public void startEngine(){
        System.out.println("Start PowerEngine");
    }
    @Override
    public void accelerate(){
        System.out.println("Accelerate");
    }
    @Override
    public void stopEngine(){
        System.out.println("Stop PowerEngine");
    }
}
