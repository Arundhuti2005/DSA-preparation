package com.Day7;

import java.util.Scanner;

public class Peri_sqr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of one side : ");
        int a = in.nextInt();
        double Peri = 4*a;
        System.out.println("Perimeter = "+Peri);
    }
}
