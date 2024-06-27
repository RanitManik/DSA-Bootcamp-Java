// Q22. Perfect Number In Java

package A03__conditionals_loops.assignments.Intermediate;

import java.util.Scanner;

public class Program_22 {

    // Function to check if a number is perfect
    static boolean isPerfectNumber(int num) {
        int sum = 1; // Initialize sum of divisors with 1 (since 1 is always a divisor)

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                sum += i;
                if (i != num / i) {
                    sum += num / i;
                }
            }
        }

        return sum == num;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();

        if (isPerfectNumber(num)) {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }
    }
}

