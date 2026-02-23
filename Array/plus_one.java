package Array;
//[1,2,3]->[1,2,4]
//[2,9,9]->[3,0,0]


import java.util.Arrays;

class plus_one {
    public static int[] plusOne(int[] digits) {
        long number = 0;   // use long to reduce overflow risk
        // Convert array to number
        for (int i = 0; i < digits.length; i++) {
            number = number * 10 + digits[i];
        }
        // Add one
        number += 1;
        // Convert number back to array
        String s = Long.toString(number);
        int[] result = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            result[i] = s.charAt(i) - '0';
        }
        return result;
    }
    public static void main(String[]args){
        int[] digits={1,2,3};
        int[] output=plusOne(digits);
        System.out.println(Arrays.toString(output));
    }
}
