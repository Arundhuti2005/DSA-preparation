package com.Day11;

public class Overloading {
    public static void main(String[] args) {
        fun(20);
        fun("Aru");

    }
    static void fun (int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
}
