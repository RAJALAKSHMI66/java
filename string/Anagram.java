package string;

import java.util.HashMap;

public class Anagram {
    public static boolean validAnagram(String s,String t){
        HashMap<Character,Integer>mapS=new HashMap<>();
        HashMap<Character,Integer>mapT=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            mapS.put(c, mapS.getOrDefault(c,0)+1);
        }
        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            mapT.put(c,mapT.getOrDefault(c,0)+1);
        }
        return mapS.equals(mapT);
    }
    public static void main(String[]args){
        String s="anagram";
        String t="nagaram";
        boolean result=validAnagram(s,t);
        System.out.println(result);
    }
}




//without hashmap


//class Solution {
//    public boolean isAnagram(String s, String t) {
//
//        if (s.length() != t.length()) {
//            return false;
//        }
//
//        int[] freq = new int[26];
//
//        // Count characters in s
//        for (int i = 0; i < s.length(); i++) {
//            freq[s.charAt(i) - 'a']++;
//        }
//
//        // Subtract characters using t
//        for (int i = 0; i < t.length(); i++) {
//            freq[t.charAt(i) - 'a']--;
//            if (freq[t.charAt(i) - 'a'] < 0) {
//                return false;
//            }
//        }
//
//        return true;
//    }
//}



//using Arrays sorting approach

//import java.util.Arrays;
//
//class Solution {
//    public boolean isAnagram(String s, String t) {
//
//        if (s.length() != t.length()) {
//            return false;
//        }
//
//        char[] a = s.toCharArray();
//        char[] b = t.toCharArray();
//
//        Arrays.sort(a);
//        Arrays.sort(b);
//
//        return Arrays.equals(a, b);
//    }
//}
