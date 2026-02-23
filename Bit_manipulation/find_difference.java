
//Input: s = "abcd", t = "abcde"
//Output: "e"
//Explanation: 'e' is the letter that was added.

package Bit_manipulation;

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
