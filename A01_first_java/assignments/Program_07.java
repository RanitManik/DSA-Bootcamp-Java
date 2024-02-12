// Q7. To calculate Fibonacci Series up to n numbers.

package A01_first_java.assignments;

import java.util.Scanner;

public class Program_07 {
    public static void main(String[] args) {
        System.out.print("Enter the value of n: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int first = 0, second = 1;
        int ans = 0;

        System.out.print("The Fibonacci series up to " + n + " numbers is: ");

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
