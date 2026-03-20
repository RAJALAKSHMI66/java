package Input_taking_approach;
//to take space seperated values

import java.util.*;
public class array_no_size {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        String nums[]=str.split(" ");
        ArrayList<Integer>list=new ArrayList<>();
        for(String num:nums){
            list.add(Integer.parseInt(num));
        }
        for(int element:list){
            System.out.println(element);
        }
    }
}


//import java.util.Scanner;
//
//public class PrintArrayFromString {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        // Take input as a single string
//        String input = sc.nextLine();
//
//        // Split into array
//        String[] arr = input.split(" ");
//
//        // Print elements
//        for (int i = 0; i < arr.length; i++) {
//            int num = Integer.parseInt(arr[i]);
//            System.out.println(num);
//        }
//    }
//}