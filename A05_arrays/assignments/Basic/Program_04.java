package A05_arrays.assignments.Basic;

public class Program_04 {
    public int maximumWealth(int[][] accounts) {
        int n = accounts.length;
        int[] eachWealth = new int[n];

        // Initialize max outside the loop
        int max = 0;

        for (int row = 0; row < n; row++) {
            for (int col : accounts[row]) {
                eachWealth[row] += col;
            }

            // Move the max comparison outside the inner loop
            if (eachWealth[row] > max) {
                max = eachWealth[row];
            }
        }

        return max;
    }
}
