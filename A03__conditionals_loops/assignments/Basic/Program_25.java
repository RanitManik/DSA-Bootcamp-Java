// Q25. Take integer inputs till the user enters 0 and print the largest number from all.

package A03__conditionals_loops.assignments.Basic;

import java.util.Scanner;

public class Program_25 {
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
                if (n > ans) {
                    ans = n;
                }
            }
        }
        System.out.println("the largest of all numbers: " + ans);
    }
}
