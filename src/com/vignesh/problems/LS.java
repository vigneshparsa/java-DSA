package com.vignesh.problems;

import java.util.ArrayList;
import java.util.Arrays;

public class LS {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 7;
        System.out.println(LS(arr , target ,0));
        System.out.println(findIndex(arr , target , 0));
        System.out.println(findIndexLast(arr , target , 0));

    }
    static boolean LS (int []arr ,int target , int index){
        if(index == arr.length){
            return false;
        }
        return (arr[index] == target || LS(arr , target , index+1 ));
    }
    static int findIndex(int [] arr , int target , int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else{
            return findIndex(arr , target , index + 1);
        }
    }
    static int findIndexLast(int [] arr , int target , int index){
        if(index == -1){
           return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else{
            return findIndexLast(arr , target , index - 1);
        }
    }
}
