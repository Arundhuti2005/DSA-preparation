package com.Day4;

import java.util.Scanner;

public class Convert_currency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rupees =sc.nextInt();
        double USD=0.011*rupees;
        System.out.println("value of USD="+USD);
    }
}
