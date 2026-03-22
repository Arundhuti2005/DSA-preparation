package com.Day4;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int reverse = 0;
        while(n>0){
            int Last_dig=n%10;
            reverse=reverse*10+Last_dig;
            n=n/10;

        }
        if(reverse==original){
            System.out.println("The number is palindrome");
        }
        else{
            System.out.println("number is not palindrome");
        }
    }
}
