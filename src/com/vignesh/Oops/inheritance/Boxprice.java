package com.vignesh.Oops.inheritance;

public class Boxprice extends Boxweight {
    double cost;

    public Boxprice () {
        super();
        this.cost = cost;
    }

    Boxprice(Boxprice other) {
        super(other);
        this.cost = other.cost;
    }
    public Boxprice(double length, double width, double height, double weight) {
        super(length, width, height, weight);
        this.cost = cost;
    }

    Boxprice(double side, double weight, double cost) {
        super(side, weight);
        this.cost = cost;
    }
}
