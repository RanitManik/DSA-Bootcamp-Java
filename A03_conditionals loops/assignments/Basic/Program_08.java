// Q8. Perimeter Of Circle

package A03_conditionals_loops.assignments.Basic;

import java.util.Scanner;

public class Program_08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of the Circle: ");
        int r = in.nextInt();
        float C = (float) (2 * (22.0 / 7) * r);
        System.out.println("The perimeter of the circle is: " + C);
    }
}
