// Q13. Perimeter Of Rhombus

package A03.conditionals_loops.assignments.Basic;

import java.util.Scanner;

public class Program_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the rhombus: ");
        int l = in.nextInt();
        int p = 4 * l;
        System.out.println("The perimeter of the Rhombus is: " + p);
    }
}
