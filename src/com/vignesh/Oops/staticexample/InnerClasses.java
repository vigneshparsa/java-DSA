package com.vignesh.Oops.staticexample;


public class InnerClasses {

    static class Inner{
        String name;
        Inner(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Inner a = new Inner("vignesh");
        Inner b = new Inner("rahul");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}
