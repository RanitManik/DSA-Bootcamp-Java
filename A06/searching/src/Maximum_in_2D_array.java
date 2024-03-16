package A06.searching.src;

import java.util.Arrays;

public class Maximum_in_2D_array {
    public static void main(String[] args) {
        System.out.println("The array is: ");
        int[][] arr = {
                {23, 341, 65},
                {26, 31},
                {45, 41, 55, 56},
                {18, 22}
        };
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
        System.out.print("The max element in the 2D array is: ");
        System.out.println(Maximum(arr));

        System.out.println("Integer.MIN_VALUE: " + Integer.MIN_VALUE);
    }

    static int Maximum(int[][] array) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : array) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
}

