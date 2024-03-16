// Q14. Volume Of Cone Java Program

package A03.conditionals_loops.assignments.Basic;

import java.util.Scanner;

public class Program_14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Radius of the cone: ");
        int r = in.nextInt();
        System.out.print("Enter the Height of the cone: ");
        int h = in.nextInt();

        float v = (float) (22.0 / 7) * r * r * (float) (h / 3.0);
        System.out.println("The volume of the Cone is: " + v);
    }
}
