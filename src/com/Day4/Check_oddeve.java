package com.Day4;

import java.util.Scanner;

public class Check_oddeve {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num =sc.nextInt();
        if(num%2==0){
            System.out.println("number is Even");
        }
        else{
            System.out.println("number is odd");
        }
    }
}
