package A05.arrays.src;

import java.util.Arrays;

public class Reverse_of_array {
    public static void main(String[] args) {
        // 1st array (even number) ==>
        int[] arr1 = {2, 3, 5, 4, 5, 8, 6, 5, 1, 1};
        System.out.println("first array ==>");
        System.out.println("before reverse: " + Arrays.toString(arr1));
        reverse(arr1);
        System.out.println("after reverse: " + Arrays.toString(arr1));
        // 2nd array (odd number) ==>
        int[] arr2 = {3, 5, 4, 5, 8, 6, 5, 1, 1};
        System.out.println("second array ==>");
        System.out.println("before reverse: " + Arrays.toString(arr2));
        reverse(arr2);
        System.out.println("after reverse: " + Arrays.toString(arr2));
    }

    // reverse function ==>
    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;

        }
    }

    // swap function ==>
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
