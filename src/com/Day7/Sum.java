package com.Day7;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        sum();
    }
    static void sum(){
        Scanner  in = new Scanner(System.in);
        System.out.println("enter 1st no :");
        int n1= in.nextInt();
        System.out.println("enter 2nd no :");
        int n2 =in.nextInt();
        int sum=n1+n2;
        System.out.println("sum="+sum);
    }
}
