package Array;

import java.util.Scanner;

public class bubble_sort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the elements of array:");
        String input=scan.nextLine();
        input = input.replace("[", "").replace("]", "");
        String[] parts=input.split("[,\\s]+");
        int[]arr=new int[parts.length];
        for(int i=0;i< parts.length;i++){
            arr[i] = Integer.parseInt(parts[i]);
        }
        // Bubble sort
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Print sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
