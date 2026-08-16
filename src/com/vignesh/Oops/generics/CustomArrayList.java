package com.vignesh.Oops.generics;

import java.util.Arrays;

public class CustomArrayList {

    private int [] data;
    private int DEFAULT_SIZE = 10;
    private int size = 0;


    public CustomArrayList() {
        this.data = new int [DEFAULT_SIZE];
    }
    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }
    private void resize() {
        int[] temp = new int[data.length * 2];

        //copy the current items in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }
    private boolean isFull(){
        return size == data.length;
    }
    public int remove(int index){
        int removed = data[--size];
        return removed;
    }
    public int get(int index){
        return data[index];
    }
    public int size(){
        return size;
    }
    public void set(int index, int value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", DEFAULT_SIZE=" + DEFAULT_SIZE +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
       // ArrayList<Integer> list = new ArrayList<>();
        CustomArrayList list = new CustomArrayList();
//        list.add(2);
//        list.add(6);
//        list.add(4);
//        list.add(5);
//        list.remove(2);
//        list.get(2);

        for (int i = 0; i < 14; i++){
            list.add(2 * i);
        }
        System.out.println(list);
        System.out.println(list.remove(2));
        System.out.println(list.get(2));

    }
}
