package Array;//Input: nums = [1,3,5,6], target = 5
//Output: 2
//Example 2:
//
//Input: nums = [1,3,5,6], target = 2
//Output: 1



public class search_insert_position {
    public static int searchInsert(int[]nums,int target){
        int low=0,high=nums.length-1;
        while(low<=high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
    public static void main(String[]args){
        int[]nums={1,3,5,6};
        int target=5;
        int result=searchInsert(nums,target);
        System.out.println(result);
    }

}
