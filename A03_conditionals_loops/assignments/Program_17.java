// Q17. Volume Of Sphere

package A03_conditionals_loops.assignments;

import java.util.Scanner;

public class Program_17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Radius of the Cylinder: ");
        int r = in.nextInt();

        double v = (double) ((4.0 / 3) * (22.0 / 7) * r * r * r);
        System.out.println("The volume of the Cylinder is: " + v);
    }
}
