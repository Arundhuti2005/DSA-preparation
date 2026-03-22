package com.Day4;

import java.util.Scanner;

public class Armstrong_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int original=n;
        int num=0;
        while(n>0) {
            int r = n % 10;
            num+=r*r*r;
            n = n / 10;
        }
        if(num==original){
            System.out.println("This is an Armstrong Number");
        }
        else {
            System.out.println("Not an Armstrong number");
        }
    }
}
