package A03_conditionals_loops.assignments.Intermediate;

import java.util.Scanner;

public class Program_24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = in.nextInt();

        int sum = sumOfDigits(number);

        System.out.println("The sum of the digits of " + number + " is: " + sum);
    }

    // Function to calculate the sum of the digits of a number
    static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        return sum;
    }
}
