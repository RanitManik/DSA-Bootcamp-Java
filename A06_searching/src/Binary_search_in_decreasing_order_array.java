package A06_searching.src;

public class Binary_search_in_decreasing_order_array {
    public static void main(String[] args) {
        // descending order sorted array ==>
        int[] arr = {52, 51, 50, 49, 48, 47, 46, 45, 44, 43, 42, 41, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        int target = 5;
        int ans = binarySearch(arr, target);
        System.out.println("The index where the target element is present is: " + ans);
    }

    // return the index of the target ==>
    // return -1 if the target does not exist in the array ==>

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // find the middle element
            // int mid = (start + end) / 2 ==> might possible that (start + end) exceed the limit of an integer
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                start = mid + 1;
            } else if (target > arr[mid]) {
                end = mid - 1;
            } else {
                return mid; // answer found
            }
        }

        return -1;
    }
}