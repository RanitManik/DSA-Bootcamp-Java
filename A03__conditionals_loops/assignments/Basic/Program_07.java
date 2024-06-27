// Q7. Area Of Equilateral Triangle

package A03__conditionals_loops.assignments.Basic;

import java.util.Scanner;

public class Program_07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the side length of the equilateral triangle: ");
        int r = in.nextInt();
        float C = (float) (3 * r);
        System.out.println("The perimeter of the equilateral triangle is: " + C);
    }
}
