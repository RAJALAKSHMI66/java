
//Input: words = ["Hello","Alaska","Dad","Peace"]
//Output: ["Alaska","Dad"]
//Explanation:
//Both "a" and "A" are in the 2nd row of the American keyboard due to case insensitivity.

package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

class keyboard_row {
    public String[] findWords(String[] words) {
        // Step 1: map each letter to its keyboard row
        HashMap<Character, Integer> charRow = new HashMap<>();
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        for (int i = 0; i < row1.length(); i++) {
            charRow.put(row1.charAt(i), 1);
        }
        for (int i = 0; i < row2.length(); i++) {
            charRow.put(row2.charAt(i), 2);
        }
        for (int i = 0; i < row3.length(); i++) {
            charRow.put(row3.charAt(i), 3);
        }

        ArrayList<String> result = new ArrayList<>();

        // Step 2: check each word
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String lowerWord = word.toLowerCase();
            int row = charRow.get(lowerWord.charAt(0));
            boolean valid = true;

            for (int j = 0; j < lowerWord.length(); j++) {
                char c = lowerWord.charAt(j);
                if (charRow.get(c) != row) {
                    valid = false;
                    break;
                }
            }

            if (valid) result.add(word);
        }

        // Step 3: convert result list to array
        return result.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        keyboard_row sol = new keyboard_row();
        System.out.println(Arrays.toString(sol.findWords(words))); // [Alaska, Dad]
    }
}

