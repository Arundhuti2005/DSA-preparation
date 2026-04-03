package Search.Day16;

public class Search_InRange {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4, 5};
        int start=0;
        int end =3;
        int target=2;
        int ans = Linear_srch(arr,target,start,end);
        System.out.println(ans);

    }
    static int Linear_srch(int [] arr,int target,int start,int end){
        //target=3;
        if(arr.length==0){
            return -1;
        }
        for(int i =start ;i<end; i++){
            int element = arr[i];
            if(element==target){
                return i;
            }
        }
        return -1;
    }
}

