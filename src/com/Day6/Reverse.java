package com.Day6;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number to reverse:");
        int n = in.nextInt();
        int rev=0;
        while(n>0){
            int digit = n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        System.out.println(rev);

    }
}
