package Array;

import java.util.Scanner;

public class binary_search {
    public static int binarySearch(int[] arr, int search) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == search) {
                return mid;
            } else if (arr[mid] < search) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1; // not found
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the length of array:");
        int len = scan.nextInt();

        int[] arr = new int[len];

        System.out.println("Enter array elements (sorted):");
        for (int i = 0; i < len; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Enter the search value:");
        int search = scan.nextInt();

        int result = binarySearch(arr, search);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
