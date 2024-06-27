package A06__searching.src;

public class Binary_search {
    public static void main(String[] args) {
        // ascending order sorted array ==>
        int[] arr = {-18, -15, -8, 0, 1, 12, 45, 52, 65, 74, 85, 100};
        int target = 52;
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
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid; // answer found
            }
        }

        return -1;
    }
}
