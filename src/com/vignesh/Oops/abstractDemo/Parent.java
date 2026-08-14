package com.vignesh.Oops.abstractDemo;

public abstract class Parent {


    int age;
    String name;
    final int VALUE;

    public Parent(int age, String name) {
        this.age = age;
        this.name = name;
        VALUE = 722;
    }

    static void hello() {
        System.out.println("hello");
    }

    void sayHello() {
        System.out.println("say hello");
    }

    abstract void career();
    abstract void partner();
}
