package A05_arrays.assignments.Basic;

public class Program_12 {
    public int largestAltitude(int[] gain) {
        int max = 0;
        for (int i = 0; i < gain.length; i++) {
            if (i != 0) {
                gain[i] += gain[i - 1];
            }
            if (gain[i] > max) {
                max = gain[i];
            }
        }
        return max;
    }
}
