// Q3. Calculate Average Of N Numbers

package A03.conditionals_loops.assignments.Intermediate;

import java.util.Scanner;

public class Program_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = in.nextInt();

        System.out.print("Enter the numbers: ");
        int addition = 0;
        for (int i = 0; i < n; i++) {
            int input = in.nextInt();
            addition = addition + input;
        }
        int average = addition / n;
        System.out.println("The average of the numbers is: " + average);
    }
}
