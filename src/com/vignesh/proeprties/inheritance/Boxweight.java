package com.vignesh.proeprties.inheritance;

public class Boxweight extends Box {
    double weight;


    public Boxweight () {
        this.weight = weight;


    }

    public Boxweight (Boxweight other) {
        super(other);
        weight = other.weight;
    }
    Boxweight (double side,double weight) {
        super(side);
        this.weight = weight;
    }

    public Boxweight (double length, double width, double height,double weight) {
        super(length, width, height);
        this.weight = weight;
    }

    public void information() {
        System.out.println("Running the Boxweight information");
    }
}
