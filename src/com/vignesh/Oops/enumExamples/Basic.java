package com.vignesh.Oops.enumExamples;

public class Basic  {
    enum Week implements A{
        MONDAY,TUESDAY,wednesday,thursday,friday,saturday,sunday;
        //these are enum constants
        //public, static, and final
        //since its final you can create child enums
        //type is Week
        Week(){
            System.out.println("This is the week of :" + this);
        }
        //this is not the enum concept

        @Override
        public void hello(){
            System.out.println("Hey how are you");
        }
    }


    public static void main(String[] args) {
        Week week;
        week = Week.MONDAY;
        week.hello();

//        for(Week days :Week.values()){
//            System.out.println(days);
//        }
//        System.out.println(week);
//        System.out.println(week.ordinal());
        //System.out.println(Week.valueOf("MONDAY"));


    }
}
