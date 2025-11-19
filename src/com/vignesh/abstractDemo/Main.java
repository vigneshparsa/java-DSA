package com.vignesh.abstractDemo;

public class Main {
    public static void main(String[] args) {

        Parent son = new Son(22,"vignesh");
        son.career();
        son.hello();
        son.sayHello();
        son.partner();


        Parent daughter = new Daughter(20,"xyz");
        daughter.career();
        daughter.hello();
        daughter.sayHello();
        daughter.partner();

        //Parent parent = new Parent();
        Parent.hello();


        // we cant create an object of abstract class
        // we cant create constructor of abstract class
    }
}
