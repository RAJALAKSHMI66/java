
//Example 1:
//        Input: s = "abccccdd"
//        Output: 7
//        Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.

package string;

import java.util.HashMap;

public class longest_palindrome {
    public static int longestPalindrome(String s){
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            map.put(c, map.getOrDefault(c,0)+1);
        }
        int length=0;
        boolean hasOdd=false;
        for(int count:map.values()){
            if(count%2==0){
                length+=count;
            }
            else{
                length+=count-1;
                hasOdd=true;
            }
        }
        if(hasOdd==true){
            length=length+1;
        }
        return length;
    }
    public static void main(String[]args){
        String s="abccccdd";
        int result=longestPalindrome(s);
        System.out.println(result);

    }
}
