package com.Day7;

import java.util.Scanner;

public class Area_rhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of 1st diagonal : ");
        int d1= in.nextInt();
        System.out.println("Enter size of 2nd diagonal : ");
        int d2= in.nextInt();
        double Area = (d1*d2)/2.0;
        System.out.println("Area = "+Area);
    }
}
