package com.vignesh.proeprties.inheritance;

import java.util.Scanner;

public class Box {
    double length;
    double width;
    double height;
    double side;

    static void greeting() {
        System.out.println("Hey I am in Box class. Greetings!");
    }

    Box() {
        this.length = -1;
        this.width = -1;
        this.height = -1;
    }

    Box(double side) {
        this.length = side;
        this.width = side;
        this.height = side;
    }

    Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.side = side;
    }

    Box(Box other) {
        this.length = other.length;
        this.width = other.width;
        this.height = other.height;
    }

    public void information() {
        System.out.println("Running the Box information");
    }
}
