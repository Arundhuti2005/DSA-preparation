package Array.Day15;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int [] arr ={ 1,5,23,45,34,78};
        swap(arr,1,5);
        System.out.println(Arrays.toString(arr));
    }
    static void swap (int [] arr , int index1, int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }



}
