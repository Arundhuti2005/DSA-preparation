package com.Day5;

import java.util.Scanner;

public class count_num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int r=0;
        while(n>0){
            if(n%10==7){
                r+=1;
            }
            n=n/10;
        }
        System.out.println(r);
    }
}
