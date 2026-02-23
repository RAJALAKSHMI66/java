
//Example 1:
//        Input: nums = [1,2,3,1], k = 3
//        Output: true
//        Example 2:
//        Input: nums = [1,0,1,1], k = 1
//        Output: true
//        Example 3:
//        Input: nums = [1,2,3,1,2,3], k = 2
//        Output: false

package Array;

import java.util.HashMap;

public class contains_duplicate_2 {
    public static boolean containDuplicate(int[]num,int k){
        HashMap<Integer,Integer>lastIndex=new HashMap<>();
        for(int i=0;i<num.length;i++){
            if(lastIndex.containsKey(num[i])){
                int previndex=lastIndex.get(num[i]);
                if(i-previndex<=k){
                    return true;
                }
            }
            lastIndex.put(num[i],i);
        }
        return false;
    }
    public static void main(String[]args){
        int[]num={1,2,3,1};
        int k=3;
        boolean result=containDuplicate(num,k);
        System.out.println(result);
    }
}
