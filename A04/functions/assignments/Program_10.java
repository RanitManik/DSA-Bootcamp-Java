package A04.functions.assignments;

import java.util.Scanner;

public class Program_10 {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        if (reverseNum(number) == number) {
            System.out.println("The Number given is a Palindrome number.");
        } else System.out.println("The Number given is not a Palindrome number.");
    }

    public static int reverseNum(int num) {
        int reversed = 0;
        for (int i = 0; i < num; i++) {

            while (num != 0) {
                int digit = num % 10;
                reversed = reversed * 10 + digit;
                num /= 10;
            }
        }
        return reversed;
    }
}
