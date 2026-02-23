
//Input: nums = [1,2,3,1]
//        Output: true
//        Explanation:
//        The element 1 occurs at the indices 0 and 3.

package Array;
import java.util.HashSet;
public class contains_duplicate {
    public static boolean conatinsDuplicate(int[]nums){
        HashSet<Integer>seen=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(seen.contains(nums[i])){
                return true;
            }
            seen.add(nums[i]);
        }
        return false;
    }
    public static void main(String[]args){
        int []nums={1,2,1,4};
        boolean result=conatinsDuplicate(nums);
        System.out.println(result);
    }
}
