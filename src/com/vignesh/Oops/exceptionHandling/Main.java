package com.vignesh.Oops.exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

    try{
        String name = "vignesh";
        if(name.equals(name)){
            throw new Myexception("name is vignesh");
        }
//        divide(a,b);
//        int c = a / b;
    } catch(ArithmeticException e) {
        System.out.println(e.getMessage());
    }catch(Exception e) {
        System.out.println("new exception");
    }
    finally{
        System.out.println("this will always execute");
    }
    }
    static int divide(int a, int b) throws ArithmeticException {
        if(b == 0){
            throw new ArithmeticException("please do not divide by zero");
        }
        return a / b;
    }
}
