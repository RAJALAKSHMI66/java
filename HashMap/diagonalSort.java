package HashMap;
import java.util.*;

//Input: mat = [[3,3,1,1],[2,2,1,2],[1,1,1,2]]
//Output: [[1,1,1,1],[1,2,2,2],[1,2,3,3]]

class diagonalSort {

    public int[][] diagonalSortMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        // Map to store diagonals
        Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();

        // Step 1: Store elements in min-heaps based on (row - col)
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                map.putIfAbsent(i - j, new PriorityQueue<>());
                map.get(i - j).offer(mat[i][j]);
            }
        }

        // Step 2: Fill matrix back with sorted elements
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = map.get(i - j).poll();
            }
        }

        return mat;
    }
}