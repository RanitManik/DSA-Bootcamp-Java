package A05_arrays.assignments.Basic;

public class Program_15 {
    public int diagonalSum(int[][] mat) {
        int numberOfRows = mat.length;
        int numberOfCols = mat[0].length;

        // Check if the matrix is square
        if (numberOfRows != numberOfCols) {
            throw new IllegalArgumentException("Input matrix must be square.");
        }

        int diagonalSum = 0;

        for (int i = 0; i < numberOfRows; i++) {
            diagonalSum += mat[i][i];  // Primary diagonal
            diagonalSum += mat[i][numberOfCols - 1 - i];  // Secondary diagonal
        }

        // If the matrix has an odd size, subtract the middle element once (to avoid double counting)
        if (numberOfRows % 2 == 1) {
            diagonalSum -= mat[numberOfRows / 2][numberOfCols / 2];
        }

        return diagonalSum;
    }
}

