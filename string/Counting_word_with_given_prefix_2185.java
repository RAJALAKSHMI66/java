package string;

import java.util.Scanner;

public class Counting_word_with_given_prefix_2185 {
    public static int CountingPrefix(String[]word,String pref){
        int count=0;
        for(int i=0;i<word.length;i++){
            if(word[i].startsWith(pref)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        String line=scan.nextLine();
        String[]word=line.split("[\\[\\],\\s\"]+");
        String pref=scan.nextLine();
        int result=CountingPrefix(word,pref);
        System.out.println(result);
    }
}
