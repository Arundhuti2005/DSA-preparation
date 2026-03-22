package com.Day4;

import java.util.Scanner;

public class Simple_interest {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        float p=sc.nextFloat();
        float r=sc.nextFloat();
        float t= sc.nextFloat();
        float SI=(p*r*t)/100;
        System.out.println("Simple interest is : "+SI);
    }
}
