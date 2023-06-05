package com.lianxi;

public class Main {
    public static void main(String[] args) {
        System.out.println(A.num);
        //A a = new A();
        //System.out.println(a.num);

    }
}

abstract class A{
    static int num = 10;
     public abstract void A();
     void B(){};
}
class B extends A{
    @Override
    public void A(){};
}