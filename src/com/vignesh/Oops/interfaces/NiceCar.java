package com.vignesh.Oops.interfaces;

public class NiceCar {
    private Engine engine;
    private Media player = new CDPlayer();


    public NiceCar(){
        engine = new PowerEngine();
    }
    public NiceCar(Engine engine){
        this.engine = engine;
    }
    public void startEngine(){
      engine.startEngine();
    }
    public void stopEngine(){
      engine.stopEngine();
    }
    public void accelerate(){
        engine.accelerate();
    }
    public void startMusic(){
        player.startplayer();
    }
    public void stopMusic(){
        player.stopplayer();
    }
    public void upgradeEngine(Engine engine){
        this.engine = engine;
    }
}
