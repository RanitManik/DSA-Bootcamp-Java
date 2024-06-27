// Q9. Calculate Batting Average

package A03__conditionals_loops.assignments.Intermediate;

import java.util.Scanner;

public class Program_09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter total runs scored: ");
        int totalRuns = in.nextInt();

        System.out.print("Enter total times dismissed: ");
        int timesDismissed = in.nextInt();

        // Calculate batting average
        double battingAverage = (double) totalRuns / timesDismissed;

        // Print the result
        System.out.printf("Batting average: %.2f", battingAverage);

        // Close the scanner
        in.close();
    }
}
