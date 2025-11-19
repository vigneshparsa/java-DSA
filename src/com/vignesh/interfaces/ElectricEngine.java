package com.vignesh.interfaces;

public class ElectricEngine implements Engine{
    @Override
    public void startEngine(){
        System.out.println("Start ElectricEngine");
    }
    @Override
    public void accelerate(){
        System.out.println("Accelerate ElectricEngine");
    }
    @Override
    public void stopEngine(){
        System.out.println("Start ElectricEngine");
    }
}
