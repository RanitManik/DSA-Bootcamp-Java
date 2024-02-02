// Q14. Armstrong Number In Java

package A03_conditionals_loops.assignments.Intermediate;

import java.util.Scanner;

public class Program_14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = in.nextInt();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        in.close();
    }

    static boolean isArmstrong(int num) {
        int originalNum = num;
        int numOfDigits = String.valueOf(num).length();
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += (int) Math.pow(digit, numOfDigits);
            num /= 10;
        }

        return sum == originalNum;
    }
}
