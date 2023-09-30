// Q26. Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.

package A03_conditionals_loops.assignments.Intermediate;

import java.util.Scanner;

public class Program_26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num;
        int sumNegative = 0;
        int sumPositiveEven = 0;
        int sumPositiveOdd = 0;

        do {
            System.out.print("Enter a number (0 to exit): ");
            num = in.nextInt();

            if (num < 0) {
                sumNegative += num;
            } else if (num % 2 == 0 && num > 0) {
                sumPositiveEven += num;
            } else if (num % 2 != 0 && num > 0) {
                sumPositiveOdd += num;
            }

        } while (num != 0);

        System.out.println("Sum of negative numbers: " + sumNegative);
        System.out.println("Sum of positive even numbers: " + sumPositiveEven);
        System.out.println("Sum of positive odd numbers: " + sumPositiveOdd);
    }
}
