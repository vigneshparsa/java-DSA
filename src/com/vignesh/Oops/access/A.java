package com.vignesh.Oops.access;

public class A {
    private int num;
    String name;
    int []arr;

    public int getnum(){
        return num;
    }

    public void setnum(int num){
        this.num = num;
    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
