package com.vignesh.Oops.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape;
        shape = new Shapes();
        shape.area();
        shape = new Circle();
        shape.area();
        Shapes square = new Square();

        square.area();

    }
}
