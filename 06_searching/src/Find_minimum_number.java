package A06_searching.src;

import java.util.Arrays;

public class Find_minimum_number {
    public static void main(String[] args) {
        int[] arr = {12, 51, 65, 654, 32, 547, 98, 15};
        System.out.println(Arrays.toString(arr));
        System.out.print("The minimum number in the array is: " + min(arr));
    }

    // assume arr.length != 0 ==>
    // return the minimum value in the array ==>
    static int min(int[] arr) {
        int min = arr[0]; // assuming the first element is the minimum number
        for (int j : arr) { // enhanced for loop which will 'min' the element if any element < min
            if (j < min) {
                min = j;
            }
        }
        return min;
    }
}
