// Q9. To find Armstrong Number between two given number.

package A02_first_java.assignments;

import java.util.Scanner;

public class Program_09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the lower bound: ");
        int lower_bound = in.nextInt();
        System.out.println("Enter the upper bound: ");
        int upper_bound = in.nextInt();
        int ans = 0;

        while (lower_bound <= upper_bound) {
            int temp = lower_bound;
            while (temp > 0) {
                int rem = temp % 10;
                ans = ans + (rem * rem * rem);
                temp = temp / 10;
            }
            if (lower_bound == ans) {
                System.out.print(ans + " ");
            }
            ans = 0;
            lower_bound++;
        }
    }
}
