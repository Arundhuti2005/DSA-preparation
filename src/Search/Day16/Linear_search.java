package Search.Day16;
//time complexity = O(1)(only one comparison made),worst case=O(N)(you don't find the item),N=size of array;

public class Linear_search {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,6,7,8,9,0};
        int target=23;
       int ans = Linear_srch(arr,target);
        System.out.println(ans);
        if(ans == -1){
            System.out.println("not found");
        };

    }
    static int Linear_srch(int [] arr,int target){
        //target=3;
    if(arr.length==0){
        return -1;
    }
    for(int i =0 ;i<arr.length; i++){
        int element = arr[i];
        if(element==target){
            return i;
        }
    }
    return -1;
    }
}