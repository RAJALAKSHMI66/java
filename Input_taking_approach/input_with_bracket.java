package Input_taking_approach;

import java.util.ArrayList;
import java.util.Scanner;

public class input_with_bracket {
    public static void main(String[]args){
    Scanner scan=new Scanner(System.in);
    String str=scan.nextLine();
    if(str.startsWith("{")&&str.endsWith("}")){
        str=str.substring(1,str.length()-1);
    }
    String nums[]=str.split(",");
    ArrayList<Integer> list=new ArrayList<>();
    for(String num:nums){
        list.add(Integer.parseInt(num));
    }
    for(int element:list){
        System.out.println(element);
    }
}
}


//
//import java.util.Scanner;
//
//public class PrintArrayFromString {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        // Input like {1,2,3,4}
//        String input = sc.nextLine();
//
//        // Remove { and }
//        input = input.replace("{", "").replace("}", "");
//
//        // Split by comma
//        String[] arr = input.split(",");
//
//        // Print elements
//        for (int i = 0; i < arr.length; i++) {
//            int num = Integer.parseInt(arr[i].trim());
//            System.out.println(num);
//        }
//    }
//}
