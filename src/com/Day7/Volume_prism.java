package com.Day7;

import java.util.Scanner;

public class Volume_prism {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of base : ");
        int b = in.nextInt();
        System.out.print("Enter size of height : ");
        int h = in.nextInt();
        System.out.print("Enter size of height of prism : ");
        int H = in.nextInt();

        double volume = (1.0 / 2.0) * b * h * H;
        System.out.println("volume = " + volume);
    }
}
