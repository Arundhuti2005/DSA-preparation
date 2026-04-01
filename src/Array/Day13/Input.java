package Array.Day13;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] arr = new int[6];
        for(int i=0;i<arr.length; i++){
            arr[i]= in.nextInt();
            //  System.out.println(arr[i]);
        }
        //for modifying
        arr[1]=20;
        System.out.println(Arrays.toString(arr));
//        for(int i=0;i<arr.length; i++){
//            System.out.print(arr[i] +" ");
//            //  System.out.println(arr[i]);
//        }
        //System.out.println(arr[0]);
        //System.out.println(arr[7]);//ArrayIndexoutofBound
    }
}

