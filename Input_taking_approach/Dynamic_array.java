package Input_taking_approach;
import java.util.*;
public class Dynamic_array {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(scan.nextInt());
        }
        for(int i=0;i<n;i++){
            System.out.println(list.get(i)+" ");
        }
        for(int element:list){
            System.out.println(element+" ");
        }
    }
}
