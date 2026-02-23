
//Input: n = 19
//        Output: true
//        Explanation:
//        12 + 92 = 82
//        82 + 22 = 68
//        62 + 82 = 100
//        12 + 02 + 02 = 1

package HashSet;

import java.util.HashSet;

public class HappyNumber {
    public static boolean happy_Number(int n){
        HashSet <Integer> seen=new HashSet<>();
        while(n!=1){
            if(seen.contains(n)){
                return false;
            }
            seen.add(n);
            n=sumOfSquares(n);
        }
        return true;
    }
    public static int sumOfSquares(int n){
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum +=digit*digit;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[]args){
        int n=19;
        boolean result=happy_Number(n);
        System.out.println(result);
    }
}
