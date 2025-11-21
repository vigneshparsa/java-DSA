package com.vignesh.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1 , 3 , 5 , 2 , 7 , 8 , 9 , 6 , 4};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr) {
        boolean Swapped;
        //run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            Swapped = false;
            //for each step max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    Swapped = true;
                }
            }
            if (!Swapped) {
                break;
            }
        }
    }
}
