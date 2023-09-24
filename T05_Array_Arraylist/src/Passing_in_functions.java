package T05_Array_Arraylist.src;

import java.util.Arrays;

public class Passing_in_functions {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 12};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }

    // This behaviour is called 'mutability' ==> Arrays are mutable
    static void change(int[] arr) {
        arr[0] = 99;
    }
}

