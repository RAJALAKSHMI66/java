//input: watermelon, apple, orange, banana, brange, lemon, apple list of strings representing different words
//        remove duplicates and print the unique words in ascending and descending order in java take input from
//        user in java

package string;

import java.util.*;

public class UniqueWordsSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter words (separated by space or comma):");
        String input = sc.nextLine();

        // Split by comma or space
        String[] words = input.split("[,\\s]+");

        // Remove duplicates
        Set<String> set = new HashSet<String>();
        for (int i = 0; i < words.length; i++) {
            set.add(words[i]);
        }

        // Convert set to list
        List<String> list = new ArrayList<String>(set);

        // Ascending order
        Collections.sort(list);
        System.out.println("Ascending Order:");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        // Descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("\nDescending Order:");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        sc.close();
    }
}
