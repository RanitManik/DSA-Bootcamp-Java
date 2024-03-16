package A06.searching.src;

import java.util.Arrays;
import java.util.Scanner;

public class row_and_column_wise_sorted_matrix {
    public static void main(String[] args) {
        System.out.print("Enter the number you want to find: ");
        Scanner in = new Scanner(System.in);

        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };
        int target = in.nextInt();
        System.out.println(Arrays.toString(search(arr, target)));
    }

    static int[] search(int[][] matrix, int target) {
        int r = 0;
        int c = matrix[0].length - 1;

        while (r < matrix.length && c >= 0) {
            if (matrix[r][c] == target) {
                return new int[]{r, c};
            }
            if (matrix[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }
        return new int[]{-1, -1};
    }
}