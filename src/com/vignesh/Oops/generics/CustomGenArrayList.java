package com.vignesh.Oops.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomGenArrayList<T> {

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;


    public CustomGenArrayList() {
        data = new Object [DEFAULT_SIZE];
    }
    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }
    public void add(String str){
        if(isFull()){
            resize();
        }
        data[size++] = str;
    }
    private void resize() {
        Object[] temp = new Object[data.length * 2];

        //copy the current items in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }
    private boolean isFull(){
        return size == data.length;
    }
    public T remove(){
        T removed = (T)(data[--size]);
        return removed;
    }
    public T get(int index){
        return (T)data[index];
    }
    public int size(){
        return size;
    }
    public void set(int index, T value){
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
            ArrayList<Integer> list = new ArrayList<>();
            list.add(2);
            list.add(6);
            list.add(8);
            list.add(7);


            for (int i = 0; i < 14; i++){
                list.add(2 * i);
            }

            System.out.println(list);

            ArrayList<Integer> list2 = new ArrayList<>();
              list2.add(23);

        CustomGenArrayList<Integer> list3 = new CustomGenArrayList<>();
        for (int i = 0; i < 14; i++){
            list3.add(2 * i);
        }
        System.out.println(list3);
    }
}
