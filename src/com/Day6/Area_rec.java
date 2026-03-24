package com.Day6;

import java.util.Scanner;

public class Area_rec {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length:");
        int length= in.nextInt();
        System.out.println("Enter width:");
        int width=in.nextInt();
        double Area = length *width;
        System.out.println("Area = "+Area);
    }
}
