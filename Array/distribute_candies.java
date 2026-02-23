package Array;
//Input: candyType = [1,1,2,2,3,3]
//Output: 3
//Explanation: Alice can only eat 6 / 2 = 3 candies. Since there are only 3 types, she can eat one of each type.
import java.util.*;
class distribute_candies {
    public static int distributeCandies(int[] candyType) {
        // Step 1: count distinct types
        Set<Integer> distinct = new HashSet<>();
        for (int i = 0; i < candyType.length; i++) {
            distinct.add(candyType[i]);
        }

        // Step 2: maximum candies she can eat
        int maxCandies = candyType.length / 2;

        // Step 3: return min(distinct types, max candies allowed)
        return Math.min(distinct.size(), maxCandies);
    }
    public static void main(String[]args){
        int [] candyType={1,1,2,2,3,3};
        int result=distributeCandies(candyType);
        System.out.println(result);
    }
}
