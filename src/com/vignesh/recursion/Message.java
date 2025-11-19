package com.vignesh.recursion;

public class Message {
    public static void main(String[] args) {
        Message();
    }
    static void Message(){
        System.out.println("I am from message");
        Message1();
    }
    static void Message1(){
        System.out.println("I am from message1");
        Message2();
    }
    static void Message2(){
        System.out.println("I am from message2");
        Message3();
    }
    static void Message3(){
        System.out.println("I am from message3");
        Message4();
    }
    static void Message4(){
        System.out.println("I am from message4");
    }
}
