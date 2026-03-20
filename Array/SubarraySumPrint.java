
//ip:1 2 3 4 5
//ip:        5
//op:       [2,3]
//op:        [5]

package Array;

import java.util.*;

public class SubarraySumPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int k = sc.nextInt();

        String[] parts = input.split("[,\\s]+");
        int[] arr = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;

            for (int j = i; j < arr.length; j++) {
                sum += arr[j];

                if (sum == k) {
                    System.out.print("[");

                    for (int m = i; m <= j; m++) {
                        System.out.print(arr[m]);
                        if (m < j) {
                            System.out.print(",");
                        }
                    }

                    System.out.println("]");
                }
            }
        }

        sc.close();
    }
}
