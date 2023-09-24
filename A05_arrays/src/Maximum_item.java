package A05_arrays.src;

public class Maximum_item {
    public static void main(String[] args) {
        // array initialization and declaration ==>
        int[] arr = {26, 69, 55, 38, 95, 52, 68, 87, 45, 54};
        // calling the max function ==>
        System.out.println(max(arr));

        // calling the range_max function ==>
        System.out.println(range_max(arr, 1, 4));
    }

    // max function declaration (for all elements) ==>
    static int max(int[] arr) {
        System.out.print("the maximum of all the elements is: ");
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // range_max function declaration (in a range) ==>
    static int range_max(int[] arr, int start, int end) {
        System.out.printf("the maximum element in the range (%d,%d) is: ", start, end);
        // 'printf' method ==>
        // printf: System.out.printf() is a method used to format and print the given message to the console.
        // it allows you to specify placeholders (like %d for integers, %f for floating-point numbers, etc.)
        // and then provide the actual values to be inserted at those placeholders
        int max = arr[0];
        for (int i = start; i < end; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
