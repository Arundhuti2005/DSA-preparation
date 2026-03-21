package com.day3;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = input.nextInt();
        System.out.println("Enter second number:");
        int b = input.nextInt();
        int hcf = findHCF(a,b);
        System.out.println("HCF="+hcf);
    }
    public static int findHCF( int a,int  b) {
        while(b!=0){
            int temp=b;
             b= a%b;
             a=temp;
        }
        return a;
    }
}
