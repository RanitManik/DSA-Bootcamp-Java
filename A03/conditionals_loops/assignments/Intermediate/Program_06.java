// Q6. Calculate Commission Percentage

package A03.conditionals_loops.assignments.Intermediate;

import java.util.Scanner;

public class Program_06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Get total sales and commission rate from the user
        System.out.print("Enter total sales: ");
        double totalSales = in.nextDouble();

        System.out.print("Enter commission rate (in percentage): ");
        double commissionRate = in.nextDouble();

        // Calculate commission
        double commission = (totalSales * commissionRate) / 100;

        // Print the commission
        System.out.println("The commission is: " + commission);

        // Close the scanner
        in.close();
    }
}