// Q16. Volume Of Cylinder

package A03_conditionals_loops.assignments;

import java.util.Scanner;

public class Program_16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Radius of the Cylinder: ");
        int r = in.nextInt();
        System.out.print("Enter the Height of the Cylinder: ");
        int h = in.nextInt();

        float v = (float) ((22.0 / 7) * r * r * h);
        System.out.println("The volume of the Cylinder is: " + v);
    }
}
