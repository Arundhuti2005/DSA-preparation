package com.Day7;

import java.util.Scanner;

public class Volume_cylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of radious : ");
        int r = in.nextInt();
        System.out.print("Enter size of height : ");
        int h = in.nextInt();
        double volume = 3.14 * Math.pow(r, 2) * h;
        System.out.println("volume = " + volume);
    }
}
