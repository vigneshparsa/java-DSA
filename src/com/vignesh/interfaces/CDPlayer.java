package com.vignesh.interfaces;

public class CDPlayer implements Media{

    @Override
    public void startplayer(){
        System.out.println("I start the music now");
    }
    @Override
    public void stopplayer(){
        System.out.println("I stop the music now");
    }
}
