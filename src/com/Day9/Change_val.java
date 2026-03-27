package com.Day9;


import java.util.Arrays;

public class Change_val {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void change(int num []){
        num[0]=99;
    }
}
