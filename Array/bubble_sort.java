package Array;

import java.util.Scanner;

public class bubble_sort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of inputs: ");
        int n = scan.nextInt();
        int[] m = new int[n];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < n; i++) {
            m[i] = scan.nextInt();
        }
        // Bubble sort
        for (int i = 0; i < m.length; i++) {
            for (int j = i + 1; j < m.length; j++) {
                if (m[i] > m[j]) {
                    int temp = m[i];
                    m[i] = m[j];
                    m[j] = temp;
                }
            }
        }

        // Print sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(m[i] + " ");
        }
    }
}
