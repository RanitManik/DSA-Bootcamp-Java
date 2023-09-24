package A06_searching.src;

import java.util.Scanner;

public class Linear_search_return_value {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number you want to find in the array: ");
        // the array ==>
        int[] nums = {23, 56, 45, 89, 74, 75, 95, 42, 26, 84, 31, 13};
        int target = in.nextInt();
        // calling the function ==>
        int ans = linear_search(nums, target);
        if (ans == -1) {
            // if the function linear_search returns '-1' ==>
            System.out.println("The element is not present in the array.");
        } else
            // if the target element is present in the array ==>
            System.out.printf("The element %d is present in the array.", ans);

    }

    // searching in the array: return the index if found the item
    // otherwise if item not found return '-1'
    static int linear_search(int[] arr, int target) {

        // run a enhanced for loop ==>
        for (int element : arr) {
            // check for an element at every index if or is == target ==>
            // if its true then return the element itself ==>
            if (element == target) {
                return element;
            }
        }
        // this line will execute if none of the above return statements have executed
        // ==> no return statement has been hit in the function
        // ==> hence the target is not found
        return -1;
    }
}
