package string;

import java.util.*;

public class SplitArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read array input
        String input = sc.nextLine();

        // Split by comma or space
        String[] parts = input.split("[,\\s]+");

        int[] arr = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i]);
        }

        // Read k
        int k = sc.nextInt();

        int groupSize = k - 1;
        int index = 0;

        while (index < arr.length) {
            System.out.print("[");
            int count = 0;

            while (index < arr.length && count < groupSize) {
                System.out.print(arr[index]);
                index++;
                count++;

                if (count < groupSize && index < arr.length) {
                    System.out.print(",");
                }
            }

            System.out.print("]");
        }

        sc.close();
    }
}