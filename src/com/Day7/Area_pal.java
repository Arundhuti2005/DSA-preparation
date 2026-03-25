package com.Day7;

import java.util.Scanner;

public class Area_pal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of base of parallelogram : ");
        int base = in.nextInt();
        System.out.print("Enter Height of parallelogram : ");
        int height = in.nextInt();
        double Area = base*height;
        System.out.println("Area of parallelogram = "+Area);
    }
}
