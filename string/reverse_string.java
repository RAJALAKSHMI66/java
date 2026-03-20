package string;

import java.util.Arrays;

public class reverse_string {
    public static void ReverseString(char[]s){
        String reverse="";
        for(int i=s.length-1;i>=0;i--){
            reverse += s[i];
        }
        for(int i=0;i<s.length;i++){
            s[i]=reverse.charAt(i);
        }
    }
    public static void  main(String[]args){
        char []s={'h','e','l','l','o'};
        ReverseString(s);
        System.out.println(Arrays.toString(s));
    }
}

//using temporary variable

//public static void ReverseString(char[] s){
//    int left = 0;
//    int right = s.length - 1;
//
//    while(left < right){
//        char temp = s[left];
//        s[left] = s[right];
//        s[right] = temp;
//
//        left++;
//        right--;
//    }
//    public static void  main(String[]args){
//        char []s={'h','e','l','l','o'};
//        ReverseString(s);
//        System.out.println(Arrays.toString(s));
//    }
//}