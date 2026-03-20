package Array;

import java.util.*;

public class MoveMultipleof10 {
    public static void main(String[] args) {
        int[] arr = {10, 12, 5, 40, 30, 7, 5, 9, 10};
        int n = arr.length;

        int[] result = new int[n];
        int index = 0;

        // Step 1: Add non-multiples of 10
        for (int i = 0; i < n; i++) {
            if (arr[i] % 10 != 0) {
                result[index++] = arr[i];
            }
        }

        // Step 2: Add multiples of 10
        for (int i = 0; i < n; i++) {
            if (arr[i] % 10 == 0) {
                result[index++] = arr[i];
            }
        }

        // Print result
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}