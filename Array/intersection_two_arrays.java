
//Example 1:
//        Input: nums1 = [1,2,2,1], nums2 = [2,2]
//        Output: [2]
//        Example 2:
//        Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//        Output: [9,4]

package Array;

import java.util.HashSet;

public class intersection_two_arrays {
    public static int[] IntersectArray(int[]nums1,int[]nums2){
        HashSet<Integer>set=new HashSet<>();
        HashSet<Integer>resultSet=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
                resultSet.add(nums2[i]);
            }
        }
        // Convert resultSet to Object array
        Object[] temp = resultSet.toArray();
        // Copy to int array
        int[] result = new int[temp.length];
        for (int i = 0; i < temp.length; i++) {
            result[i] = (int) temp[i];
        }
        return result;
    }
    public static void main(String[]args){
        int [] nums1={1,2,2,1};
        int [] nums2={2,2};
        int[] result=IntersectArray(nums1,nums2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
