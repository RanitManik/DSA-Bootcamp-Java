// Q13. Sum Of N Numbers

package A03__conditionals_loops.assignments.Intermediate;

import java.util.Scanner;

public class Program_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int ans = 0;

        System.out.print("Enter the value of N: ");
        int n = in.nextInt();
        System.out.println("Enter the " + n + " numbers: ");

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = in.nextInt();
            ans += num;
        }
        System.out.println("\nThe sum of the " + n + " numbers is: " + ans);
    }
}
