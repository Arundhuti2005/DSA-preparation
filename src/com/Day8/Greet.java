package com.Day8;

public class Greet {
    public static void main(String[] args) {
    // String message=greeting();
       // System.out.println(message);
        String my_message=my_Greet("Krish");
        System.out.println(my_message);
    }

    private static String my_Greet(String name) {
        String message="welcome "+name;
        return message;
    }
//    static String greeting (){
//        String greet = "Hey Aru-";
//        return greet;
//    }

}
