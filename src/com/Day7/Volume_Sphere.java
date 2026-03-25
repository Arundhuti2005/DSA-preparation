package com.Day7;

import java.util.Scanner;

public class Volume_Sphere {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of radious : ");
        int r = in.nextInt();
        double volume = (4.0/3.0)*3.14*Math.pow(r,3);
        System.out.println("volume = "+volume);

    }
}
