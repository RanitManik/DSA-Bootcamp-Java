package A06__searching.src;

public class Order_Agnostic_Binary_Search {
    public static void main(String[] args) {
        // ascending order sorted array ==>
        int[] arr_1 = {-18, -15, -8, 0, 48, 1, 12, 45, 52, 65, 74, 85, 100};
        int[] arr_2 = {52, 51, 50, 49, 48, 47, 46, 45, 44, 43, 42, 41, 40};
        int target = 45;
        int ans_1 = binarySearch(arr_1, target);
        int ans_2 = binarySearch(arr_2, target);
        System.out.println("The index where the target element is present of the ascending array is: " + ans_1);
        System.out.println("The index where the target element is present of the descending array is: " + ans_2);
    }


    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAscending = arr[start] < arr[end];

        while (start <= end) {
            // find the middle element
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAscending) { // case ==> ascending
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else { // case ==> descending
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
