// Q21. Fibonacci Series In Java Programs

package A03_conditionals_loops.assignments.Basic;

import java.util.Scanner;

public class Program_21 {
    public static void main(String[] args) {
        System.out.print("Enter the value of n: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int first = 0, second = 1;
        int ans = 0;

        System.out.println("The Fibonacci series up to " + n + " numbers are: ");

        for (int i = 0; i < n; i++) {
            if (i <= 1) {
                ans = i;
            } else {
                ans = first + second;
                first = second;
                second = ans;
            }
            System.out.print(ans + " ");
        }
    }
}
