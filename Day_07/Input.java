package Day_07;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = new int[6];
        int[] arr = new int[5];

        // repetitive method to input elements of an array ==>
        array[0] = 231;
        array[1] = 230;
        array[2] = 253;
        array[3] = 233;
        array[4] = 293;
        // [ 231, 230, 253, 233, 293, 0 ]

        // printing an object of an array ==>
        System.out.println(array[3]);

        // printing the array ==>
        System.out.println(Arrays.toString(array));

        // input using for loop ==>
        System.out.println("enter the inputs of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        // printing the array using for loop ==>
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println(" ");

        // printing the array using enhanced for loop ==>
        // syntax ==>
        /*
        for (datatype_of_array : variable_name){
             System.out.print(variable_name + " ");
         */
        for (int j : arr) { //for every element in array, prints the element
            System.out.print(j + " "); // here num represents each element of the array
        }

        System.out.println(" ");

        // in this array, as the size of the array is specified as '4', if you try to execute "arr[5]" then it will give 'index out of bound' error

        // printing an array using 'toString()' Method ==>
        System.out.println(Arrays.toString(arr));
    }
}
