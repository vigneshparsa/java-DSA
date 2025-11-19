package com.vignesh.polymorphism;

import java.awt.*;

public class Triangle extends Circle {
    @Override
    void area() {
        System.out.println("Area is 0.5 * h * b");
    }
}
