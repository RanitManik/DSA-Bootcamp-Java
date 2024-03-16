// Q24. Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

package A03.conditionals_loops.assignments.Basic;

import java.util.Scanner;

public class Program_24 {
    public static void main(String[] args) {
        System.out.println("Enter '0' to exit the loop ==>");
        System.out.print("Enter the numbers: ");
        Scanner in = new Scanner(System.in);
        int ans = 0;
        while (true) {
            int n = in.nextInt();
            if (n == 0) {
                break;
            } else {
                ans = ans + n;
            }
        }
        System.out.println("the sum of all numbers: " + ans);
    }
}
