package A05_arrays.assignments.Basic;

public class Program_22 {
    public int[] sumZero(int n) {
        int[] result = new int[n];
        int left = 0, right = n - 1;
        int value = n;

        while (left <= right) {
            result[left] = -value;
            result[right] = value;
            if (left == right) {
                result[left] = 0;
            }
            left++;
            right--;
            value--;
        }

        return result;
    }
}
