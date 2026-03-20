package HashMap;

import java.util.*;

public class ShoesPair {
    public static void main(String[] args) {
        String[] shoes = {"7L","7R","7L","8L","6R","7R","8R","6R"};

        HashMap<Integer, Integer> left = new HashMap<>();
        HashMap<Integer, Integer> right = new HashMap<>();

        for (int i = 0; i < shoes.length; i++) {
            int size = Integer.parseInt(shoes[i].substring(0, shoes[i].length() - 1));
            char type = shoes[i].charAt(shoes[i].length() - 1);

            if (type == 'L') {
                left.put(size, left.getOrDefault(size, 0) + 1);
            } else {
                right.put(size, right.getOrDefault(size, 0) + 1);
            }
        }

        int pairs = 0;

        for (int size : left.keySet()) {
            pairs += Math.min(left.get(size), right.getOrDefault(size, 0));
        }

        System.out.println(pairs);
    }
}