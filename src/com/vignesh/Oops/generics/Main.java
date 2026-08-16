package com.vignesh.Oops.generics;

public class Main implements GenericInterface<Integer> {


    @Override
    public void display(Integer value) {
        System.out.println(value);
    }

    public static void main(String[] args) {


        GenericInterface<Integer> genericInterface = new Main();
        genericInterface.display(1);
        genericInterface.display(2);
        System.out.println(genericInterface);
    }
}
