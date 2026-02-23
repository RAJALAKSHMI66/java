
//Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
//Output: [-1,3,-1]
//Explanation: The next greater element for each value of nums1 is as follows:
//        - 4 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
//        - 1 is underlined in nums2 = [1,3,4,2]. The next greater element is 3.
//        - 2 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.

//this can also be possible using stack

package Array;

import java.util.Arrays;

public class next_greater_element {

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int num = nums1[i];
            boolean found = false;
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == num) {  // ✅ use j, not i
                    for (int k = j + 1; k < nums2.length; k++) {
                        if (nums2[k] > num) {
                            result[i] = nums2[k];
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        result[i] = -1;
                    }
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        int[] result = nextGreaterElement(nums1, nums2);
        System.out.println(Arrays.toString(result)); // ✅ print array nicely
    }
}


