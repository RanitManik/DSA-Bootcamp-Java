package A05_arrays.assignments.Basic;

public class Program_26 {
    public int[] plusOne(int[] digits) {

        int n = digits.length;

        // Traverse the array from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Increment the current digit
            digits[i]++;

            // If the digit becomes 10, set it to 0 and continue with the next iteration
            if (digits[i] == 10) {
                digits[i] = 0;
            } else {
                // If the digit is less than 10, no need to carry, return the updated array
                return digits;
            }
        }

        // If we reached here, all digits were 9, and we need to add a new leading digit 1
        int[] result = new int[n + 1];
        result[0] = 1;

        return result;
    }
}