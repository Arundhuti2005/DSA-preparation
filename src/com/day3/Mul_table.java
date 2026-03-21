package com.day3;

import java.util.Scanner;

public class Mul_table {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for(int i=1;i!=11;i++){
           int result = num*i;
           System.out.println(result);
        }
    }
}
