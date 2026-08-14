package com.vignesh.Oops.interfaces;

public class Car implements Engine, Brake ,Media{
    @Override
    public void startEngine() {
        System.out.println("I start the engine now");
    }
    @Override
    public void stopEngine() {
        System.out.println("I stop the engine now");
    }
    @Override
    public void accelerate() {
        System.out.println("I accelerate the engine now");
    }
    @Override
    public void brake() {
        System.out.println("I brake the engine now");
    }
    @Override
    public void startplayer() {
        System.out.println("I start the player now");
    }
    @Override
    public void stopplayer() {
        System.out.println("I stop the player now");
    }

}
