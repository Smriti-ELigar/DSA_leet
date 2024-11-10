import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ansRow = new ArrayList<>();
        
        // Initialize the first row
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        ansRow.add(firstRow);

        // Generate subsequent rows
        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = ansRow.get(i - 1);
            List<Integer> newRow = new ArrayList<>();
            newRow.add(1); // First element of each row is always 1

            // Generate the middle elements of the row
            for (int j = 1; j < i; j++) {
                newRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            newRow.add(1); // Last element of each row is always 1
            ansRow.add(newRow);
        }

        return ansRow;
    }

    public static List<List<Integer>> pascalTriangle(int n) {
        Solution sol = new Solution();
        List<List<Integer>> ans = new ArrayList<>();

        // Store the entire Pascal's triangle:
        for (int row = 1; row <= n; row++) {
            ans.addAll(sol.generate(row));
        }
        return ans;
    }
}
