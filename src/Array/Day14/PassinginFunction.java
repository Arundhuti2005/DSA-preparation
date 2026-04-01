package Array.Day14;

import java.util.Arrays;//java is string immutable but array mutable.Dynamic memory allocation is not contiguous

public class PassinginFunction {
    public static void main(String[] args) {
        int [] arr ={2,4,3,5,6,8};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int [] num){
        num[1]=5;
    }
}
