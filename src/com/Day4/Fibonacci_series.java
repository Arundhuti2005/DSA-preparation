package com.Day4;

import java.util.Scanner;

public class Fibonacci_series {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int num=0;
        int sum =0;
        while(num!=(n+1)){
            sum+=num;
            System.out.println(sum);
            num++;
        }
        //System.out.println(sum);
    }
}
