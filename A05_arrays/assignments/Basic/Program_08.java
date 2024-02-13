package A05_arrays.assignments.Basic;

import java.util.ArrayList;

public class Program_08 {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        ArrayList<Integer> listAnswer = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if ((j != i) && (nums[j] < nums[i])) {
                    count++;
                }
            }
            listAnswer.add(count);
        }

        // Convert ArrayList to array
        int[] result = new int[listAnswer.size()];
        for (int i = 0; i < listAnswer.size(); i++) {
            result[i] = listAnswer.get(i);
        }

        return result;
    }
}
