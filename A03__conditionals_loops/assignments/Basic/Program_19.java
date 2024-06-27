// Q19. Curved Surface Area Of Cylinder

package A03__conditionals_loops.assignments.Basic;

import java.util.Scanner;

public class Program_19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Radius of the Cylinder: ");
        int r = in.nextInt();
        System.out.print("Enter the Height of the Cylinder: ");
        int h = in.nextInt();

        float v = (float) ((22.0 / 7) * 2 * r * h);
        System.out.println("The Curved Surface Area Of Cylinder is: " + v);
    }
}
