package Bit_manipulation;
//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//You must implement a solution with a linear runtime complexity and use only constant extra space.
//Example 1:
//Input: nums = [2,2,1]
//Output: 1

public class single_number {
    public static int SingleNumber(int[]nums){
        int result=0;
        for(int i=0;i<nums.length;i++){
            result^=nums[i];
        }
        return result;
    }
    public static void main(String[]args){
        int[]nums={4,1,2,1,2};
        int result=SingleNumber(nums);
        System.out.println(result);
    }
}
