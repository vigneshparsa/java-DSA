package com.vignesh.Oops.generics.comparing;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student vignesh = new Student(7,88.7f);
        Student xyz = new Student(22,99.7f);
        Student akhil = new Student(35,90.7f);
        Student karl = new Student(17,85.3f);

        Student[] list = {vignesh,xyz,akhil,karl};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list, (o1, o2) -> -(int)(o1.marks - o2.marks));
        System.out.println(Arrays.toString(list));


        if(vignesh.compareTo(xyz) < 0){
            System.out.println(vignesh.compareTo(xyz));
            System.out.println(" xyz has more than vignesh");
        }
    }
}
