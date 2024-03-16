package A04.functions.assignments;

import java.util.Scanner;

public class Program_09 {
    public static void main(String[] args) {
        System.out.print("Enter a number to calculate the factorial of the number here ==> ");
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        System.out.print("The factorial of " + number + " is = " + factorial(number));
    }

    public static int factorial(int n) {
        int ans = 1;
        if (n > 1) {
            for (int i = 1; i <= n; i++) {
                ans = ans * i;
            }
        } else if (n < 0) {
            System.out.println("Plz Enter a valid Integer...");
        } else return 1;
        return ans;
    }
}
