package com.Day11;

public class Overloading {
    public static void main(String[] args) {
//        fun(20);//at compile time it decide which function going to run.
//        fun("Aru");//hpw it is determining which function to call ,that is known as method overloading here function name is same but parameter are different.
        int ans= sum(2,3);// if we don't use any parameter value in the function then it can't decide which function to be run and give error.means as sum();
        System.out.println(ans);
    }
//    static void fun (int a){
//        System.out.println(a);
//    }
//    static void fun(String name){
//        System.out.println(name);
    static int sum(int a, int b){
        return a+b;
    }
    static int sum(int a,int b,int c){
        return a+b+c;
    }
}
