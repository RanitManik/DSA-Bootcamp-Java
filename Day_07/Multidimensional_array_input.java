package Day_07;

import java.util.Arrays;
import java.util.Scanner;

public class Multidimensional_array_input {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the elements of the 2D array: ");

        // input of the 3/3 2D array using for loop ==>
        for (int row = 0; row < arr.length; row++) {
            // for each col in each row ==>
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        // outer for loop is iterating each row
        // and for every row the inner for loop is iterating every column

        // different methods to print a 2D array ==>
        // 1. output of the 3/3 2D array using 'for' loop ==>
        System.out.println("The array is printing using 'for' loop:");
        for (int row = 0; row < arr.length; row++) {
            // for each col in each row ==>
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(" " + arr[row][col]);
            }
            System.out.println();
        }

        // 2. output of the 3/3 2D array using 'to.string()' method ==>
        System.out.println("The array is printing using 'to.string()' method:");
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }

        // 3. output of the 3/3 2D array using 'enhanced for' loop and to.string()' method ==>
        // syntax ==>
        /*
        for (datatype_of_array[] variable_name: array_name){
             System.out.print(Arrays.toString(variable_name));
         */
        System.out.println("The array is printing using  'enhanced for' loop:");
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
