package com.Day10;

public class Scope {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        {
            a=100;//reassign the origin reference to other some value
            //int a=40//a already initialized outside of the block in the same method ,hence you can't initialize again.
            int c=80;//value of c initialized in this block.will remain in block
            System.out.println(a);
        }
        int c=70;//which is initialized in the block that can be again initialized outside the block.
        random(20);
        //System.out.println(c);//c can not use outside of block
        System.out.println(a);

    }
    static void random( int marks ){
       int num=30;
       // System.out.println(a);//here we don't get value of a because here a is uknown
        System.out.println(num);
        System.out.println(marks);
    }
}
