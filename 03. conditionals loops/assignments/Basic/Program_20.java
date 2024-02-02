// Q20. Total Surface Area Of Cube

package A03_conditionals_loops.assignments.Basic;

import java.util.Scanner;

public class Program_20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the side length of the cube: ");
        int l = in.nextInt();
        int p = 6 * l * l;
        System.out.println("The Total Surface Area Of Cube is: " + p);
    }
}
