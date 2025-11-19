package com.vignesh.abstractDemo;

public class Daughter extends Parent {

    public Daughter(int age, String name) {
        super(age , name);
    }

    @Override
    void career() {
        System.out.println("My name is" + " " + name + ", " + "I am" + " " + age + " " + "years old" + ", " + "I am going to be a doctor.");
    }

    @Override
    void partner() {
        System.out.println("I love Ironman");
    }
    static void hello() {
        System.out.println("I am ambitious");
    }

    @Override
    void sayHello() {
        super.sayHello();
    }
}
