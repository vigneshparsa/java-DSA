package com.vignesh.singleton;

import com.vignesh.access.A;

public class singleton {
    static class singleton1{

    }
    private static singleton instance;
    public static singleton getInstance() {
        if (instance == null) {
            instance = new singleton();
        }
        return instance;
    }

    public static class main {
        public static void main(String[] args){

            singleton obj1 = singleton.getInstance();

            singleton obj2 = singleton.getInstance();

            singleton obj3 = singleton.getInstance();

            A a=new A(1,"a");
            a.getnum();
        }
    }
}
