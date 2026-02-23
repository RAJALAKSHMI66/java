package HashMap;

import java.util.HashMap;

public class word_pattern {
    public static boolean wordPattern(String s,String pattern){
        String [] words=s.split(" ");
        if(pattern.length()!=words.length){
            return false;
        }
        HashMap<Character,String>mapPattern=new HashMap<>();
        HashMap<String,Character>mapWord=new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            String word=words[i];

            if (mapPattern.containsKey(ch)){
                if(!mapPattern.get(ch).equals(word)){
                    return false;
                }
            }
            else{
                mapPattern.put(ch,word);
            }
            if(mapWord.containsKey(word)){
                if(!mapWord.get(word).equals(ch)){
                    return false;
                }
            }
            else{
                mapWord.put(word,ch);
            }
        }
        return true;
    }
    public static void main(String[]args){
        String s="dog cat cat dog";
        String pattern="abba";
        boolean result=wordPattern(s,pattern);
        System.out.println(result);
    }
}


//brute force logic


//class Solution {
//    public boolean wordPattern(String pattern, String s) {
//        String[] words = s.split(" ");
//
//        if (pattern.length() != words.length) {
//            return false;
//        }
//
//        for (int i = 0; i < pattern.length(); i++) {
//            for (int j = i + 1; j < pattern.length(); j++) {
//                if (pattern.charAt(i) == pattern.charAt(j)) {
//                    if (!words[i].equals(words[j])) {
//                        return false;
//                    }
//                } else {
//                    if (words[i].equals(words[j])) {
//                        return false;
//                    }
//                }
//            }
//        }
//
//        return true;
//    }
//}
