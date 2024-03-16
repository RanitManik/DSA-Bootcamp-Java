package A05.arrays.assignments.Basic;

public class Program_20 {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length - 1;

        for (int count = 0; count < 4; count++) {
            if (areMatricesEqual(mat, target)) {
                return true;
            } else {
                mat = rotateMatrix(mat, n);
            }
        }

        // If no rotation matches the target
        return false;
    }

    private boolean areMatricesEqual(int[][] matrix1, int[][] matrix2) {
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                if (matrix1[i][j] != matrix2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    private int[][] rotateMatrix(int[][] mat, int n) {
        int[][] rotated = new int[mat.length][mat.length];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                rotated[j][n - i] = mat[i][j];
            }
        }

        return rotated;
    }
}

