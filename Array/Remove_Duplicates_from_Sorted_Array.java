package Array;//Input: nums = [1,1,2]
//Output: 2, nums = [1,2,_]
//Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
//It does not matter what you leave beyond the returned k (hence they are underscores).

public class Remove_Duplicates_from_Sorted_Array {
    public static int remove_duplicates(int[]arr){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }
    public static void main(String[]args){
        int[]arr={1,1,2};
        int result=remove_duplicates(arr);
        System.out.println(result);
    }
}



//import java.util.*;
//
//public class RemoveDuplicates {
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 2, 3, 4, 4, 5};
//
//        Set<Integer> set = new HashSet<>();
//        for (int num : arr) {
//            set.add(num);
//        }
//
//        System.out.println(set);
//    }
//}


//to sort and remove duplicates

//public class RemoveDuplicates {
//
//    public static void bubbleSort(int[] m) {
//        // Bubble sort using given logic
//        for (int i = 0; i < m.length; i++) {
//            for (int j = i + 1; j < m.length; j++) {
//                if (m[i] > m[j]) {
//                    int temp = m[i];
//                    m[i] = m[j];
//                    m[j] = temp;
//                }
//            }
//        }
//    }
//
//    public static int removeDuplicates(int[] arr) {
//        int index = 0;
//
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] != arr[index]) {
//                arr[++index] = arr[i];
//            }
//        }
//        return index + 1;
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {4, 2, 2, 5, 1, 4, 3};
//
//        // Step 1: Sort
//        bubbleSort(arr);
//
//        // Step 2: Remove duplicates
//        int newLength = removeDuplicates(arr);
//
//        // Output
//        for (int i = 0; i < newLength; i++) {
//            System.out.print(arr[i] + " ");
//        }
//    }
//}    // output - 12345
