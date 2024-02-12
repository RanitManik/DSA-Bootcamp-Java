// Q8. To find out whether the given String is Palindrome or not.

package A01_first_java.assignments;

import java.util.Scanner;

public class Program_08 {
    public static void main(String[] args) {
        System.out.print("Enter the number you want to check: ");
        Scanner in = new Scanner(System.in);
        int main_num = in.nextInt();
        int num = main_num;
        int ans = 0;

        while (num > 0) {
            int rem = num % 10;
            num /= 10;
            ans = (ans * 10) + rem;
        }

        if (ans == main_num) {
            System.out.println("This number is a palindrome number.");
        } else {
            System.out.println("This number is not a palindrome number ");
        }
    }
}
