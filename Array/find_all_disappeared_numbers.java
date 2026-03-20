
//Example 1:
//        Input: nums = [4,3,2,7,8,2,3,1]
//        Output: [5,6]
//        Example 2:
//        Input: nums = [1,1]
//        Output: [2]

package Array;
import java.util.*;
public class find_all_disappeared_numbers {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer>present=new HashSet<>();
        List<Integer>missing=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            present.add(nums[i]);
        }
        for(int i=1;i<=nums.length;i++){
            if(!present.contains(i)){
                missing.add(i);
            }
        }
        return missing;
    }
    public static  void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter array: ");
        String n=scan.nextLine();
        n=n.replace("[", "").replace("]","");
        String []nums=n.split("[,\\s]+");
//        int []nums={4,3,2,7,8,2,3,1};
//        List result=findDisappearedNumbers(nums);
//        System.out.println(result);
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=Integer.parseInt(nums[i]);
        }
        List result=findDisappearedNumbers(arr);
        System.out.println(result);
    }
}
