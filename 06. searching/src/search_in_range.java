package A06_searching.src;

public class search_in_range {
    public static void main(String[] args) {
        int[] nums = {23, 56, 45, 89, 74, 75, 95, 42, 26, 84, 31, 13};
        int target = 89;
        // calling the function ==>
        System.out.println("The index of the element you are searching in the array is: " + linear_search(nums, target, 0, 5)); // index starts from '0' in the java
    }

    // searching in the array: return the index if found the item
    // otherwise if item not found return '-1'
    static int linear_search(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        // run a for loop ==>
        for (int index = start; index <= end; index++) {
            // check for an element at every index if or is == target ==>
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        // this line will execute if none of the above return statements have executed
        // ==> no return statement has been hit in the function
        // ==> hence the target is not found
        return -1;
    }
}
