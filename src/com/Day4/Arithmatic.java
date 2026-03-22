package com.Day4;

import java.util.Scanner;

public class Arithmatic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 =sc.nextInt();
        int n2=sc.nextInt();
        int sum=n1+n2;
        int sub =n1-n2;
        double mul=n1*n2;
        float div =n1/n2;
        System.out.println("value of sum="+sum+", value of substraction ="+sub+", value of multiplication ="+mul+", value of division ="+div);
    }
}
