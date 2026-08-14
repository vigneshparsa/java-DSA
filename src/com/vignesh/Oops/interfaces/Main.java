package com.vignesh.Oops.interfaces;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.startEngine();
        car.accelerate();
        car.startplayer();
        car.stopplayer();
        car.brake();
        car.stopEngine();

        NiceCar nicecar = new NiceCar();
        nicecar.startEngine();
        nicecar.accelerate();
        nicecar.startMusic();
        nicecar.stopMusic();
        nicecar.stopEngine();
    }
}
