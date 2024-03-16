package A05.arrays.assignments.Basic;

import java.util.ArrayList;
import java.util.List;

public class Program_23 {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            int minRowValue = Integer.MAX_VALUE;
            int minRowIdx = -1;

            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] < minRowValue) {
                    minRowValue = matrix[i][j];
                    minRowIdx = j;
                }
            }

            int maxColValue = Integer.MIN_VALUE;

            for (int k = 0; k < matrix.length; k++) {
                maxColValue = Math.max(maxColValue, matrix[k][minRowIdx]);
            }

            if (minRowValue == maxColValue) {
                result.add(minRowValue);
            }
        }

        return result;
    }
}
