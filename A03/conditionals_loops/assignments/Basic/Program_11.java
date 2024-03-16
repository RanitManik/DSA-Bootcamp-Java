// Q11. Perimeter Of Rectangle

package A03.conditionals_loops.assignments.Basic;

import java.util.Scanner;

public class Program_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the lengths of adjacent sides ==>");
        System.out.print("Enter the lengths of first side: ");
        int l1 = in.nextInt();
        System.out.print("Enter the lengths of second sides: ");
        int l2 = in.nextInt();
        int p = 2 * (l1 + l2);
        System.out.println("The perimeter of the Rectangle is: " + p);
    }
}
