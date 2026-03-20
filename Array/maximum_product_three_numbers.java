package Array;
import java.util.*;

public class maximum_product_three_numbers {

    public static int MaxProduct(int n, int[] arr){

        Arrays.sort(arr); // sort directly

        int case1 = arr[n-1] * arr[n-2] * arr[n-3];
        int case2 = arr[0] * arr[1] * arr[n-1];

        return Math.max(case1, case2);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }

        int result = MaxProduct(n, arr);
        System.out.println(result);
    }
}