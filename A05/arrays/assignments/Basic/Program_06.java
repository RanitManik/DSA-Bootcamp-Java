package A05.arrays.assignments.Basic;

import java.util.ArrayList;

public class Program_06 {
    public ArrayList<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<>();
        int maxCandies = 0;

        // Find the maximum number of candies
        for (int j : candies) {
            if (maxCandies < j) {
                maxCandies = j;
            }
        }

        // Check if each kid can have the maximum candies with extraCandies
        for (int candy : candies) {
            if (candy + extraCandies >= maxCandies) {
                list.add(true);
            } else {
                list.add(false);
            }
        }
        return list;
    }

}
