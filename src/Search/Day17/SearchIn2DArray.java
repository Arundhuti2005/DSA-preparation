package Search.Day17;

import java.lang.reflect.Array;
import java.util.Arrays;

//public class SearchIn2DArray {
//    public static void main(String[] args) {
//        int [] [] arr ={
//                {23,4,1},
//                {18,12,9},
//                {78,99,34,56},
//                {18,12}
//        };
//        int target=2;
//        System.out.println(Arrays.toString(search(arr, target)));
//    }
//    static int [] search(int [] [] arr,int target){
//        for (int r=0;r<arr.length;r++){
//            for(int c=0;c<arr[r].length;c++){
//               if(arr[r][c]==target){
//                   return new int [] {r,c};//here create a new object as there is no initialization of 2d array
//               }
//            }
//        }
//        return new int []{-1,-1};
//    }
//}
public class SearchIn2DArray {
    public static void main(String[] args) {
        int [] [] arr ={
                {23,4,1},
                {18,12,9},
                {78,99,34,56},
                {18,12}
        };
        //int target=2;
        System.out.println(max(arr));
    }
    static  int  max(int [] [] arr){
        int max=arr[0][0];
        for (int r=0;r<arr.length;r++){
            for(int c=0;c<arr[r].length;c++){
                if(arr[r][c]>max){
                    max=arr[r][c];

                }

            }
        }

        return max;
       // return new int []{-1,-1};
    }
}
