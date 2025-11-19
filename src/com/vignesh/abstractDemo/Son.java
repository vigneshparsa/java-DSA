package com.vignesh.abstractDemo;

public class Son extends Parent {

    public Son(int age, String name) {
        super(age , name);
    }

    @Override
    void career() {
        System.out.println("My name is" + " " + name + " I am" + " " + age + " " + "years old" + ", I am going to be a coder.");
    }

    @Override
    void partner() {
        System.out.println("I love pepper potts");
    }
    static void hello() {
        System.out.println("It was great");
    }

    @Override
    void sayHello() {
        super.sayHello();
    }
}
