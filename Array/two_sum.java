package Array;//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

class two_sum {
    public static int[] Solution(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = Solution(nums, target);
        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found");
        }
    }
}



//import java.util.Scanner;
//class two_sum {
//    public static int[] Solution(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return new int[]{};
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        // Get array size
//        System.out.print("Enter number of elements: ");
//        int n = sc.nextInt();
//        // Create array
//        int[] nums = new int[n];
//        // Get array elements
//        System.out.println("Enter array elements:");
//        for (int i = 0; i < n; i++) {
//            nums[i] = sc.nextInt();
//        }
//        // Get target
//        System.out.print("Enter target value: ");
//        int target = sc.nextInt();
//        // Call solution
//        int[] result = Solution(nums, target);
//        // Output
//        if (result.length == 2) {
//            System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
//        } else {
//            System.out.println("No solution found");
//        }
//        sc.close();
//    }
//}