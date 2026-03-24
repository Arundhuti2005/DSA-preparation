package com.Day6;

import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int emp_id=in.nextInt();
        String dept=in.next();
        switch (emp_id){
            case 1:
                System.out.println("Arun Jana");
                break;
            case 2:
                System.out.println("Mou Jana");
                break;
            case 3:
                System.out.println("Employee id 3");
                switch (dept){
                    case "IT" :
                        System.out.println("IT department.");
                        break;
                    case "Manager":
                        System.out.println("Management department.");
                        break;
                    default:
                        System.out.println("enter valid department.");


                }
                break;
            default:
                System.out.println("Please enter valid emp_id");

        }
    }
}
