package A05.arrays.assignments.Basic;

public class Program_14 {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];
        int count = 0;

        for (int[] indicesArray : indices) {
            int row = indicesArray[0];
            int col = indicesArray[1];

            // Increment the entire row
            for (int i = 0; i < matrix[row].length; i++) {
                matrix[row][i]++;
            }

            // Increment the entire column
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][col]++;
            }
        }

        // Count odd values in the matrix
        for (int[] rowMatrix : matrix) {
            for (int colMatrix : rowMatrix) {
                if (colMatrix % 2 != 0) {
                    count++;
                }
            }
        }

        return count;
    }
}

