package com.Day5;

import java.util.Scanner;

public class Case {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

//        char ch= in.next().trim().charAt(0);//trim() use for remove extra space and charAt() use for define index
//        System.out.println(ch);

        char ch =in.next().charAt(0);
        if(ch>='a'&& ch<='z'){
            System.out.println("lower case");
        }else{
            System.out.println("uppercase");
        }
    }
}
