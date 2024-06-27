package A04__functions.src;

import java.util.Arrays;

public class Change_Value {
    public static void main(String[] args) {
        //create an array
        int[] arr = {1, 22, 5, 63, 4, 85};
        change(arr);
        System.out.println(Arrays.toString(arr));
        //original arr is changed
    }

    static void change(int[] nums) {
        nums[0] = 99;
        /*
        if you change the object via this reference variable,
        then the original object going to be also changed.
         */
    }
}
