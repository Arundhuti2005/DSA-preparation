package com.Day7;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int ans = sum1(20,30);
        System.out.println("sum = "+ans);
    }
    static int sum(){
        Scanner  in = new Scanner(System.in);
        System.out.println("enter 1st no :");
        int n1= in.nextInt();
        System.out.println("enter 2nd no :");
        int n2 =in.nextInt();
        int sum=n1+n2;
        return sum;
        //System.out.println("sum="+sum);
    }
    static int sum1(int a, int b){
       int sum=a+b;
       return sum;

    }
}
