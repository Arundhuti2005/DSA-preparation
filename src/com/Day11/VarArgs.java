package com.Day11;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,5,3,4,9);
        multiple(2,3,"hello","hi");

    }
    static void multiple(int a, int b, String ...v){
        //u can't use the method as multiple (int a, String ...v,int b) because u don't know length of v.
       // System.out.println(Arrays.toString(a,b,...v));

    }
    static void fun(int ...v){//here ...v means any number of input u can take means 0 or more
        System.out.println(Arrays.toString(v));
    }
}
