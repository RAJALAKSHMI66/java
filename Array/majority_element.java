package Array;//Example 1:
//
//Input: nums = [3,2,3]
//Output: 3
//Example 2:
//
//Input: nums = [2,2,1,1,1,2,2]
//Output: 2

//The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

//sort method used only when it is n/2 times repeated value

//import java.util.Arrays;
//public class majority_element {
//    public static int majorityElement(int [] nums){
//        Arrays.sort(nums);
//        return nums[nums.length/2];
//    }
//    public static void main(String[]args){
//        int[]nums={2,2,1,1,1,2,2};
//        int result=majorityElement(nums);
//        System.out.println(result);
//    }
//}

//Boyer–Moore Voting Algorithm
public class majority_element {
    public static int majorityElement(int[]nums) {
        int candidate=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                candidate=nums[i];
            }
            if(nums[i]==candidate){
                count++;
            }
            else{
                count--;
            }
        }
        return candidate;
    }
    public static void main(String[]args){
        int[]nums={2,2,1,3,3,9,8,3,5,6,3,3,89,78,56,45}; //3
        int result=majorityElement(nums);
        System.out.println(result);
    }
}