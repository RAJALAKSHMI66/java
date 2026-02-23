
//Input: nums = [3,0,1]
//        Output: 2
//        Explanation:
//        n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums

package HashSet;
import java.util.HashSet;

public class Missing_number {
    public static int MissingNumber(int[]num){
        HashSet<Integer> number=new HashSet<>();
        for(int i=0;i<num.length;i++){
            number.add(num[i]);
        }
        for(int i=1;i<=num.length;i++){
            if(!number.contains(i)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[]args){
        int[]num={1,4,3};
        int result=MissingNumber(num);
        System.out.println(result);
    }
}


//using Arrays

//import java.util.Arrays;
//class Solution {
//    public int missingNumber(int[] nums) {
//        Arrays.sort(nums);
//        for(int i=0;i<nums.length;i++){
//            if(nums[i]!=i){
//                return i;
//            }
//        }
//        return nums.length;
//    }
//}


//using maths  logic

//class Solution {
//    public int missingNumber(int[] nums) {
//        int n = nums.length;
//
//        // Expected sum of numbers from 0 to n
//        int expectedSum = n * (n + 1) / 2;
//
//        // Actual sum of array elements
//        int actualSum = 0;
//        for (int i = 0; i < nums.length; i++) {
//            actualSum += nums[i];
//        }
//
//        // Missing number
//        return expectedSum - actualSum;
//    }
//}
