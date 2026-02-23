
//Input: s = "abcd", t = "abcde"
//Output: "e"
//Explanation: 'e' is the letter that was added.

package string;

public class find_difference {
    public static char findDiff(String s,String t){
        char result=0;
        for(int i=0;i<s.length();i++){
            result^=s.charAt(i); //XOR operation
        }
        for(int i=0;i<t.length();i++){
            result^=t.charAt(i);
        }
        return result;
    }
    public static void main(String[]args){
        String s="abcde";
        String t="abcd";
        char result=findDiff(s,t);
        System.out.println(result);
    }
}


//using frequency array

//class Solution {
//    public char findTheDifference(String s, String t) {
//        int[] freq = new int[26];
//
//        for (int i = 0; i < s.length(); i++) {
//            freq[s.charAt(i) - 'a']++;
//        }
//
//        for (int i = 0; i < t.length(); i++) {
//            int idx = t.charAt(i) - 'a';
//            freq[idx]--;
//            if (freq[idx] < 0) {
//                return t.charAt(i);
//            }
//        }
//
//        return ' ';
//    }
//}
