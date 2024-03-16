package A05.arrays.src;

import java.util.Arrays;

public class Column_not_fixed {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {5, 4},
                {6, 7, 8, 9},
        };

        // printing a miscellaneous column sized 2D array ==>

        // 1. printing it through the traditional for loop ==>
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        // 2. printing it  using 'to.string()' method with enhanced for loop ==>
        System.out.println("The array is printing using 'to.string()' method with enhanced for loop:");
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
