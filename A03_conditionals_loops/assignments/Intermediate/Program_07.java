// Q7. Power In Java

package A03_conditionals_loops.assignments.Intermediate;

import java.util.Scanner;

public class Program_07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Base number: ");
        int base = in.nextInt(); // Base number
        System.out.print("Enter the exponent number: ");
        int exponent = in.nextInt(); // Exponent

        int result = 1;

        for (int i = 0; i < exponent; i++) {
            result *= base;
        }

        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }
}