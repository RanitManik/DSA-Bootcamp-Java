// Q23. Input a number and print all the factors of that number (use loops).

package A03__conditionals_loops.assignments.Basic;

import java.util.Scanner;

public class Program_23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();

        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    System.out.print(i + " ");
                }
            }
        } else if (n < 0) {
            for (int i = -1; i >= n; i--) {
                if (n % i == 0) {
                    System.out.print(i + " " + -i + " ");
                }
            }
        } else System.out.println("0 1");
    }
}
