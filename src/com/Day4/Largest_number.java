package com.Day4;

import java.util.Scanner;

public class Largest_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 =sc.nextInt();
        if(n1>n2){
            System.out.println("largest value is ="+n1);
        }
        else {
            System.out.println("largest value is =" + n2);
        }
    }
}
