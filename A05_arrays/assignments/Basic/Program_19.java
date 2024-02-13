package A05_arrays.assignments.Basic;

public class Program_19 {
    public int maximumPopulation(int[][] logs) {
        int maxPopulationYear = 1950;
        int people = 0;
        int maxPeople = 0;

        for (int i = 1950; i <= 2050; i++) {
            for (int[] logPerson : logs) {
                if ((logPerson[0] <= i) && (logPerson[1] > i)) {
                    people++;
                }
                if (people > maxPeople) {
                    maxPopulationYear = i;
                    maxPeople = people;
                }
            }
            people = 0; // Reset people count for the next year
        }
        return maxPopulationYear;
    }
}
