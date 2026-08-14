package com.vignesh.Oops;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student[] student = new Student[5];
        System.out.println(Arrays.toString(student));

        Student student1 = new Student(7,"Vignesh",100f);
        student1.greeting();
//        System.out.println(student1.name);
//        System.out.println(student1.rollno);
//        System.out.println(student1.score);

        Student student2 = new Student(22,"Mahi",90f);
        student2.greeting();
//        System.out.println(student2.name);
//        System.out.println(student2.rollno);
//        System.out.println(student2.score);

        Student student3 = new Student(23,"siddharth",89f);
        student3.greeting();
//        System.out.println(student3.name);
//        System.out.println(student3.rollno);
//        System.out.println(student3.score);




        student1.change("paradise" , 93.7f , 7 );
        System.out.println(student1.name);

        student1.Student(student2);
        System.out.println(student1.name);



    }
}