package Array.Day14;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimentional {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        1 2 3
        4 5 6
        7 8 9
         */
        //int [][] arr= new int[3][3]// give row number is mandatory but column is not.
//        int [][] arr={
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
        int[][] arr = new int[3][2];
        System.out.println(arr.length);
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                arr[r][c] = in.nextInt();
                //System.out.println(Arrays.toString(arr[r][c]));
            }
        }
//        for (int r = 0; r < arr.length; r++) {
////            for (int c = 0; c < arr[r].length; c++) {
////                System.out.print(arr[r][c]+" ");
////            }
//           System.out.println(Arrays.toString(arr[r]));
////            System.out.println();
//
//        }
        for(int [] a :arr){
            System.out.println(Arrays.toString(a));
        }
    }
}