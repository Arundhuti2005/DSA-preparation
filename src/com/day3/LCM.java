package com.day3;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number:");
        int b = sc.nextInt();
        int max =(a>b)?a:b;
        while(true){
            if((max%a==0)&&(max%b==0)){
                System.out.println(max);
                break;
            }
            else {
                max = max + 1;
            }
        }
    }
}
