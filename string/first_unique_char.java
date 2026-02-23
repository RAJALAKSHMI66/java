
//Input: s = "leetcode"
//Output: 0
//Explanation:
//The character 'l' at index 0 is the first character that does not occur at any other index.

package string;

public class first_unique_char {
    public static int UniqueChar(String s){
        int[]freq=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(freq[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[]args){
        String s="loveleetcode";
        int result=UniqueChar(s);
        System.out.println(result);
    }
}
