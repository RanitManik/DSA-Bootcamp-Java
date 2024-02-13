package A05_arrays.assignments.Basic;

public class Program_25 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;

        if (m * n != r * c) {
            // If the number of elements is not the same, return the original matrix
            return mat;
        }

        int[][] reshapedMat = new int[r][c];
        int row = 0, col = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                reshapedMat[row][col] = mat[i][j];
                col++;

                if (col == c) {
                    // Move to the next row when the column limit is reached
                    row++;
                    col = 0;
                }
            }
        }

        return reshapedMat;
    }
}
