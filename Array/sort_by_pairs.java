
//3
//        3 36
//        2 4
//        7 8

package Array;
import java.util.*;

public class sort_by_pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        // Input
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt(); // first
            arr[i][1] = sc.nextInt(); // second
        }

        // Sorting using Arrays.sort
        Arrays.sort(arr, (a, b) -> {
            if (a[0] == b[0]) {
                return a[1] - b[1]; // sort by second
            }
            return a[0] - b[0]; // sort by first
        });

        // Output
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i][0] + " " + arr[i][1]);
            if (i != n - 1) {
                System.out.print(", ");
            }
        }

        sc.close();
    }
}