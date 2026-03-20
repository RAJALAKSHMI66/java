package Input_taking_approach;

import java.util.ArrayList;
import java.util.Scanner;

public class comma_seperated_input {
    public static void main(String[]args){
    Scanner scan=new Scanner(System.in);
    String str=scan.nextLine();
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
