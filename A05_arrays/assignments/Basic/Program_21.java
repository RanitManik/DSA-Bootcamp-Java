package A05_arrays.assignments.Basic;

public class Program_21 {
    public int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        for (int i = left; i <= right; i++) {
            for (int j = i + 1; j <= right; j++) {
                int twoSum = nums[i] + nums[j];
                if (twoSum == target) {
                    return new int[]{i, j};
                }
            }
        }

        // If no such indices are found
        return new int[]{-1, -1};
    }
}
