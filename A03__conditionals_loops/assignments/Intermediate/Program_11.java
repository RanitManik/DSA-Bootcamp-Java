// Q11. Compound Interest Java Program

package A03__conditionals_loops.assignments.Intermediate;

import java.util.Scanner;

public class Program_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Get principal amount
        System.out.print("Enter the principal amount: ");
        double principal = in.nextDouble();

        // Get annual interest rate
        System.out.print("Enter the annual interest rate (as a decimal): ");
        double rate = in.nextDouble();

        // Get the number of times interest is compounded per year
        System.out.print("Enter the number of times interest is compounded per year: ");
        int n = in.nextInt();

        // Get the number of years
        System.out.print("Enter the number of years: ");
        int t = in.nextInt();

        // Calculate compound interest
        double amount = principal * Math.pow(1 + (rate / n), n * t);

        // Calculate the interest earned
        double interest = amount - principal;

        // Display the results
        System.out.println("\nCompound Interest: $" + interest);
        System.out.println("Total Amount: $" + amount);

        in.close();
    }
}
