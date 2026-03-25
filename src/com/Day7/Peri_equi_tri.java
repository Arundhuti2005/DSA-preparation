package com.Day7;

import java.util.Scanner;

public class Peri_equi_tri {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size  of side: ");
        int a = in.nextInt();
        double perimeter = 3*a;
        System.out.println("Perimeter = "+perimeter);
    }
}
