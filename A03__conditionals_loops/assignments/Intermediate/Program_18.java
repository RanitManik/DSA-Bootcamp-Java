// Q18. Future Investment Value

package A03__conditionals_loops.assignments.Intermediate;

import java.util.Scanner;

public class Program_18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the initial investment amount: ");
        double investmentAmount = in.nextDouble();

        System.out.print("Enter the annual interest rate (as a decimal): ");
        double annualInterestRate = in.nextDouble();

        System.out.print("Enter the number of years: ");
        int years = in.nextInt();

        double futureValue = investmentAmount * Math.pow(1 + annualInterestRate, years);

        String formatted_FutureValue = String.format("%.2f%n", futureValue);

        System.out.println("The future value of the investment is: " + formatted_FutureValue);

        in.close();
    }
}
