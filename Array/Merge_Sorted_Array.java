package Array;//
//Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//        Output: [1,2,2,3,5,6]


import java.util.Arrays;

class Merge_Sorted_Array {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // Step 1: create nums3
        int[] nums3 = new int[m + n];
        int index = 0;
        // Step 2: copy elements of nums1 (only m elements)
        for (int i = 0; i < m; i++) {
            nums3[index++] = nums1[i];
        }
        // Step 3: copy elements of nums2 (only n elements)
        for (int i = 0; i < n; i++) {
            nums3[index++] = nums2[i];
        }
        // Step 4: sort nums3 (same bubble sort logic)
        for (int i = 0; i < nums3.length; i++) {
            for (int j = i + 1; j < nums3.length; j++) {
                if (nums3[i] > nums3[j]) {
                    int temp = nums3[i];
                    nums3[i] = nums3[j];
                    nums3[j] = temp;
                }
            }
        }
        // Step 5: copy back to nums1
        for (int i = 0; i < nums3.length; i++) {
            nums1[i] = nums3[i];
        }
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
}
