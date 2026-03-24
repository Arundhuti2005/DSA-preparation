package com.Day6;

import java.util.Scanner;

public class Fruit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
              String fruit = in.next();
        switch(fruit){
            case ("Mango"):
                System.out.println("king of fruit.");
                break;
            case ("Apple"):
                System.out.println("sweet red fruit.");
                break;
            case("Grapes"):
                System.out.println("small sweet fruit.");
                break;
            case ("Lichi"):
                System.out.println("sweet fruit.");
                break;
            default:
                System.out.println("please enter a valid fruit.");

        }
//        int day = in.nextInt();
//        switch (day) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Pleas enter a valid day");
//                break;
////            switch (day){
////                case 1 -> System.out.println("Monday");
////                case 2 -> System.out.println("Tuesday");
////                case 3 -> System.out.println("wednesday");
////                case 4 -> System.out.println("Thursday");
////                case 5 -> System.out.println("Friday");
////                case 6 -> System.out.println("Saturday");
////                case 7 -> System.out.println("Sunday");
////                default -> System.out.println("Pleas enter a valid day");
////        }
//        }
//        int day =in.nextInt();
//        switch (day) {
//            case 1, 2, 3, 4, 5 -> System.out.println("weekday");
//            case 6, 7 -> System.out.println("weekend");
//            default -> System.out.println("enter valid day");
//        }
//        switch(day){
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("weekday");
//                break;
//            case 6:
//            case 7:
//                System.out.println("weekend");
//                break;
//            default:
//                System.out.println("enter valid day");
//        }

    }
}