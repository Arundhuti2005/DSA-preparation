package com.aru;

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //input is integer output is float
//        float num = input.nextInt();//4
//        System.out.println(num);//4.0
//
//        //input is float and output also float
//        float num1 = input.nextFloat();//5.34
//        System.out.println(num1);//5.34
//
//        //input integer but give float
//        int num2 = input.nextInt();//5.34
//        System.out.println(num2);//error
//
//       // type casting
//        int num3 = (int)(45.34f);
//        System.out.println(num3);//45
//
//        //Automatic type promotion in expression
//        int a = 257;
//        byte b = (byte)(a);
//        System.out.println(b); //-->in byte the range is 256 so use 257%256=1

//        byte b = 50;
//        b= b*2;// now b converted into int so this is type incompatible as b is again store in byte but b in int


//       character to int
//        int number ='A';
//        System.out.println(number);
//   java is unicode value
//        System.out.println("নমস্কার");

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i =50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f*b)+(i/c)-(d*s);
        //float+int-double=double as larger data type is consider
        System.out.println((f*b)+" "+(i/c)+" "+(d*s));
        System.out.println(result);
    }
}
