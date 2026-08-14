package com.vignesh.Oops.access;

public class ObjectDemo{
    int num;

    public ObjectDemo(int num){
        this.num=num;
    }
    @Override
    public String toString(){
        return super.toString();
    }
//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//    }
    @Override
    public int hashCode(){
        return super.hashCode();
    }
    @Override
    public boolean equals(Object obj){
        return super.equals(obj);
    }
    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String[] args) {
        ObjectDemo obj=new ObjectDemo(10);
        System.out.println(obj.hashCode());

        System.out.println(obj.toString());
        System.out.println(obj.num);

        //System.out.println(obj.instanceof());

        ObjectDemo obj2=obj;
        System.out.println(obj2.num);


    }
}
