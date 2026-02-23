package Array;//using hash map

import java.util.HashMap;

public class normal_most_freq_value {
    public static int FreqValue(int[]num){
        HashMap<Integer,Integer>map=new HashMap<>();
        int maxfreq=0;
        int result=num[0];
        for(int i=0;i< num.length;i++){
            int current=num[i];
            if(map.containsKey(current)){
                map.put(current,map.get(current)+1);
            }
            else{
                map.put(current,1);
            }
            if(map.get(current)>maxfreq){
                maxfreq=map.get(current);
                result=current;
            }
        }
        return result;
    }
    public static void main(String[]args){
        int[]nums={2,2,1,3,3,9,8,3,5,6,3,3,89,78,56,45};
        int result=FreqValue(nums);
        System.out.println(result);
    }
}
