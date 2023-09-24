package A05_arrays.src;

import java.util.Arrays;

public class Multidimensional_array {
    public static void main(String[] args) {
        /*
        2D array structure ==>
        1 2 3
        4 5 6
        7 8 9
         */

        // syntax to declare a 2D array ==>
        int[][] a = new int[3][]; // no of columns is not necessary to specify
        // no of rows is mandatory

        // syntax to store data into a 2D array ==>
        int[][] b = {
                {2, 3, 4}, // 0th index
                {5, 6, 7}, // 1st index
                {7, 8, 9}, // 2nd index
        };
        // 2D array ==> array of internal arrays
        // array 'b' is collection of 3 internal arrays ==>
        // 0th index ==> {2, 3, 4}, 1st index ==> {5, 6, 7} and 2nd index ==> {7, 8, 9}
        // size of the individual rows does not matter ==>
        // each internal array can have variable amount of elements

        // 2D array with variable number of elements in each row ==>
        int[][] arr2D = {
                {2, 3}, // 0th index
                {5, 6, 7}, // 1st index
                {7, 8, 9, 10}, // 2nd index
        };

        // indexing in a 2D array ==>
        /*
        arr2D[0] = {2, 3}
        arr2D[1] = {5, 6, 7}
        arr2D[2] = {7, 8, 9, 10}
         */

        // printing a 2D array ==>
        System.out.println("The array is printing using  'enhanced for' loop: ");
        for (int[] ints : arr2D) {
            System.out.println(Arrays.toString(ints));
        }

        // printing the internal elements of a 2D array ==>
        System.out.println("This are all the indexes of the 2D array: ");
        System.out.println("1st index: " + Arrays.toString(arr2D[0])); // 0th index
        System.out.println("2nd index: " + Arrays.toString(arr2D[1])); // 1st index
        System.out.println("3rd index: " + Arrays.toString(arr2D[2])); // 2nd index

        // length of a 2D array => length of rows ==>
        System.out.println("length of rows is: " + arr2D.length); // this will give us the length of rows
    }
}
