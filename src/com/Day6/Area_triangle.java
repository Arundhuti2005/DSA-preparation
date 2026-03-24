package com.Day6;

import java.util.Scanner;

public class Area_triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("type of triangle:");
        String triangle_type = in.next();
        switch(triangle_type){
            case "Equilateral" :
                System.out.println("Enter the value of side:");
                double a= in.nextDouble();
                double area=(Math.sqrt(3)/4)*a*a;
                System.out.println("Area = "+area);
                break;
            case "Isosceles":
                System.out.print("height of Isosceles triangle:");
                double h= in.nextDouble();
                System.out.print("base=");
                double b = in.nextDouble();
                double Area_iso = (1.0/2.0)*b*h;
                System.out.println("Area = "+Area_iso);
                break;
            case "scalene":
                System.out.println("Enter size of three sides : ");
                int p=in.nextInt();
                int q=in.nextInt();
                int r=in.nextInt();
                double s =((p+q+r)/2);
                double Area = Math.sqrt(s*(s-p)*(s-q)*(s-r));
                break;
            default:
                System.out.println("Pleas enter a valid triangle type");

        }
    }

}
