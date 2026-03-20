package Array;
import java.util.HashMap;
import java.util.ArrayList;
public class intersection_two_arrays_2 {
    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // Step 1: Count frequency of nums1
        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        // Step 2: Traverse nums2
        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i]) && map.get(nums2[i]) > 0) {
                list.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i]) - 1);
            }
        }
        // Step 3: Convert list to array
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
    public static void main(String[]args){
        int[] nums1={1,2,2,1};
        int[]nums2={2,2};
        int [] result=intersect(nums1,nums2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}


//easy method
//import java.util.*;
//
//class Solution {
//    public int[] intersect(int[] nums1, int[] nums2) {
//
//        Arrays.sort(nums1);
//        Arrays.sort(nums2);
//
//        int i = 0;
//        int j = 0;
//
//        List<Integer> list = new ArrayList<>();
//
//        while(i < nums1.length && j < nums2.length){
//            if(nums1[i] == nums2[j]){
//                list.add(nums1[i]);
//                i++;
//                j++;
//            }
//            else if(nums1[i] < nums2[j]){
//                i++;
//            }
//            else{
//                j++;
//            }
//        }
//
//        int[] result = new int[list.size()];
//        for(int k = 0; k < list.size(); k++){
//            result[k] = list.get(k);
//        }
//
//        return result;
//    }
//}