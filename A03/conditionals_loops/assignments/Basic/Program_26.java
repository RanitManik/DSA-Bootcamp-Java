// Q26. Addition Of Two Numbers

package A03.conditionals_loops.assignments.Basic;

import java.util.Scanner;

public class Program_26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num_1 = in.nextInt();
        System.out.print("Enter the second number: ");
        int num_2 = in.nextInt();

        int ans = num_1 + num_2;
        System.out.print("The Addition Of Two Numbers: " + ans);
    }
}
