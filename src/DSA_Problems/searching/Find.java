package DSA_Problems.searching;

import java.util.ArrayList;

public class Find {
    public static void main(String[] args) {
        int [] arr = { 2 , 3 , 1 , 4 , 5 , 4 , 7 , 4 , 22};
        findAllIndex(arr , 4 , 0);
        System.out.println(list);
    }
    static ArrayList<Integer> list = new ArrayList<Integer>();
    static void findAllIndex(int [] arr , int target , int index){
        if(index == arr.length){
            return;
        }
        if(arr[index] == target){
            list.add(index);
        }
        findAllIndex(arr , target , index + 1);
    }
}
