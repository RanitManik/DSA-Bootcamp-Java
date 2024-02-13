package A05_arrays.assignments.Basic;

public class Program_07 {
    public int numIdenticalPairs(int[] nums) {
        int numGoodPairs = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if ((nums[i] == nums[j]) && (i < j)) {
                    numGoodPairs++;
                }
            }
        }
        return numGoodPairs;
    }
}
