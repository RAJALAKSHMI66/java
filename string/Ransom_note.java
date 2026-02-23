
//Input: ransomNote = "aa", magazine = "aab"
//Output: true

package string;

public class Ransom_note {

    public static boolean RansomNote(String ransomnote,String maganize){
        if(ransomnote.length()>maganize.length()){
            return false;
        }
        int[] freq=new int[26];
        for(int i=0;i<maganize.length();i++){
            freq[maganize.charAt(i)-'a']++;
        }
        for(int i=0;i<ransomnote.length();i++){
            int idx=ransomnote.charAt(i)-'a';
            if(freq[idx]==0){
                return false;
            }
            freq[idx]--;
        }
        return true;
    }
    public static void main(String[]args){
        String ransomnote="aa";
        String maganize="aab";
        boolean result=RansomNote(ransomnote,maganize);
        System.out.println(result);
    }
}
