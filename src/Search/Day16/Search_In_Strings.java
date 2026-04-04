package Search.Day16;

import java.util.Arrays;
import java.util.stream.IntStream;

//public class Search_In_Strings {
//    public static void main(String[] args) {
//        String[] arr = {"Aru", "Mou", "Ari"};
//        String target = "Aru";
//        int ans = Search(arr, target);
//        System.out.println(ans);
//    }
//
//    static int Search(String[] arr, String target) {
//        if (arr.length == 0) {
//            return -1;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            String element = arr[i];
//            if (element == target) {
//                return i;
//            }
//        }
//        return -1;
//    }
//
//}
public class Search_In_Strings {
    public static void main(String[] args) {
        String name ="Arundhuti";
        char target = 'u';
       // int ans = Search(name , target);
        //System.out.println(ans);
        System.out.println(Arrays.toString(name.toCharArray()));
    }

//    static int Search(String str, char target) {
//        if (str.length() == 0) {
//            return -1;
//        }
//        for (int i = 0; i < str.length(); i++) {
//            //String element = str.charAt(i);
//            if (target == str.charAt(i)) {
//                return i;
//            }
//        }
//        return -1;
//    }
static boolean Search(String str, char target) {
    if (str.length() == 0) {
        return false;
    }
    //String element = str.charAt(i);
    char[] charArray = str.toCharArray();
    for (int i = 0; i < charArray.length; i++) {
        char ch = charArray[i];
        if (ch == target) {
            return true;
        }
    }
    return false;
}


}

