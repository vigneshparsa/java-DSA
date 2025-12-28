package com.vignesh.stack;

public class CustomStack{
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;

    public CustomStack() {
        this.data = new int[DEFAULT_SIZE];
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }
    public boolean push(int value) {
        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }
        data[++ptr] = value;
        return true;
    }
    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        }
            return data[ptr--];
    }
    public boolean isFull(){
        return ptr == data.length - 1;
    }
    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        }
        return data[ptr];
    }
    public boolean isEmpty(){
        return ptr == -1;
    }
}
