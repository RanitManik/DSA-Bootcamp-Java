package A05.arrays.assignments.Basic;

public class Program_16 {
    public int findNumbers(int[] nums) {
        int count = 0;

        for (int number : nums) {
            int i = 0;
            while (number > 0) {
                number /= 10;
                i++;
            }
            if (i % 2 == 0) { // check if the count of digits is even
                count++;
            }
        }
        return count;
    }
}

