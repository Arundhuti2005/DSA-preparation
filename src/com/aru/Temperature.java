package com.aru;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float Tc= input.nextFloat();
        float Tf= (Tc*9/5)+32;
        System.out.println(Tf);
    }
}
