package com.Day7;

import java.util.Scanner;

public class Peri_circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of radius : ");
        int r = in.nextInt();
        double Perimeter = 2*3.14*r;
        System.out.print("Perimeter = "+Perimeter);
    }
}
