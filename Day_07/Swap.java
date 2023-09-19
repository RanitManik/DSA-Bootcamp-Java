package Day_07;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        // initialising and declaring ==>
        int[] arr = {1, 3, 5, 9, 8};

        // printing before swap ==>
        System.out.println("before swap: " + Arrays.toString(arr));

        // applying swap function ==>
        swap(arr, 1, 3);

        // printing after swap ==>
        System.out.println("after swap: " + Arrays.toString(arr));
    }

    // declaring the swap function ==>
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
