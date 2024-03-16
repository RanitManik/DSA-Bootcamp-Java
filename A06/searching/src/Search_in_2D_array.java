package A06.searching.src;

import java.util.Arrays;
import java.util.Scanner;

public class Search_in_2D_array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // declaring and printing the array ==>
        int[][] arr = {
                {23, 341, 65},
                {26, 31},
                {45, 41, 55, 56},
                {18, 22}
        };
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }

        // taking input of the searching element ==>
        System.out.print("Enter the element you want to search: ");
        int target = in.nextInt();

        // printing the array with the row and col value of the search element ==>
        System.out.print("The following array contains row and column of the searching element: ");
        System.out.println(Arrays.toString(search(arr, target)));
        // format of return value (array) ==> {row, col}
    }

    static int[] search(int[][] array, int target) {
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (array[row][col] == target) {
                    return new int[]{row, col}; // creating and returning a new array which contains ==> {row, col} elements
                }
            }
        }
        /*
        this is enhanced for loop you can go with ==>
        for (int[] ints : array) {
            for (int anInt : ints) {
                if (anInt == target) {
                    return 1;
                }
            }
        }
         */
        return new int[]{-1, -1};
    }
}
