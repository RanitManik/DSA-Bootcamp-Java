// Q4. Calculate Discount Of Product

package A03__conditionals_loops.assignments.Intermediate;

import java.util.Scanner;

public class Program_04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the original price: ");
        double originalPrice = in.nextDouble();

        System.out.print("Enter the discount percentage (e.g., 10 for 10%): ");
        double discountPercentage = in.nextDouble();

        double discount = (originalPrice * discountPercentage) / 100;
        double discountedPrice = originalPrice - discount;

        System.out.println("Discounted Price: $" + discountedPrice);
        System.out.println("Discount Amount: $" + discount);
    }
}
