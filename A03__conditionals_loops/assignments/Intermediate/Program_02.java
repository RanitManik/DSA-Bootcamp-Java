// Q2. Calculate Electricity Bill

package A03__conditionals_loops.assignments.Intermediate;

import java.util.Scanner;

public class Program_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of units consumed: ");
        int unitsConsumed = in.nextInt();

        double unitRate = 0.12;
        double totalBill = unitsConsumed * unitRate;
        System.out.println("Total bill: $" + totalBill);
    }
}
