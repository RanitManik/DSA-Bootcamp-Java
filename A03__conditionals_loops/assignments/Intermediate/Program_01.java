// Q1. Factorial Program In Java

package A03__conditionals_loops.assignments.Intermediate;

import java.util.Scanner;

public class Program_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();

        int ans = 1;
        if (n == 0) {
        } else if (n > 0) {
            for (int i = 1; i <= n; i++) {
                ans = ans * i;
            }
        } else System.out.print("This is not a valid input..");
        System.out.print("The factorial of the entered number is: " + ans);
    }
}
