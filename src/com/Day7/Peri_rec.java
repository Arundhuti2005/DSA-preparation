package com.Day7;

import java.util.Scanner;

public class Peri_rec {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of length : ");
        int a = in.nextInt();
        System.out.println("Enter size of width : ");
        int b =in.nextInt();
        double Peri = 2*(a+b);
        System.out.println("Perimeter = " + Peri);
    }
}
