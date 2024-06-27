// Q17. Find if a number is palindrome or not

package A03__conditionals_loops.assignments.Intermediate;

import java.util.Scanner;

public class Program_17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int num = in.nextInt();

        int num_copy = num;
        int ans = 0;

        while (num_copy > 0) {
            int rem = num_copy % 10;
            ans = ans * 10 + rem;
            num_copy /= 10;
        }
        if (ans == num) {
            System.out.println(num + " is a Palindrome number.");
        } else System.out.println(num + " is not a Palindrome number.");
    }
}
