package com.driver;

public class Main {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.meth());
        A obj1 = new B();
        System.out.println(obj1.meth());
    }
}