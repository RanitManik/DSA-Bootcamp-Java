// Q8. Calculate Depreciation of Value

package A03_conditionals_loops.assignments.Intermediate;

import java.util.Scanner;

public class Program_08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter initial cost: ");
        double initialCost = in.nextDouble();

        System.out.print("Enter salvage value: ");
        double salvageValue = in.nextDouble();

        System.out.print("Enter useful life (in years): ");
        int usefulLife = in.nextInt();

        // Calculate depreciation per year
        double depreciationPerYear = (initialCost - salvageValue) / usefulLife;

        // Print the result
        System.out.println("Depreciation per year: $" + depreciationPerYear);

        // Close the scanner
        in.close();
    }
}
