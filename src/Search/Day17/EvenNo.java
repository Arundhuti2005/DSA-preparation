package Search.Day17;
//Q: in array how many even no.
public class EvenNo {
//    public static void main(String[] args) {
//        int [] arr ={12, 345,2,6,7896};
//        System.out.println(even(arr));
//
//    }
//    static int even(int []arr){
//        int count1=0;
//        int count2=0;
//        for(int i=0;i<arr.length;i++){
//            while(arr[i]>0) {
//                int digit = arr[i] % 10;
//                arr[i] = arr[i] / 10;
//
//                count1++;
//            }
//            if(count1%2==0){
//                count2++;
//            }
//        }
//        return count2;
//    }
public static void main(String[] args) {
    int [] arr ={12,345,-2,2,6,7896};
        System.out.println(find_numbers(arr));


}
static int find_numbers(int [] nums){
    int count=0;
    for (int i =0 ; i<nums.length;i++){
        if(even(nums[i])==true){
            count++;
        }
    }
    return count;
}
static int digits(int nums){
    if(nums<0){
        nums=-1*nums;
    }
    return (int)(Math.log10(nums)+1);
}
static boolean even(int num){
//    int count =0;
//
//    while(num>0){
//        num=num/10;
//        count++;
//    }
    if(digits(num)%2==0){
        return true;
    }
    return false;
}
}
