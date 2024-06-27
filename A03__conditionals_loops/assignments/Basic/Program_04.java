// Q4. Area Of Isosceles Triangle

package A03__conditionals_loops.assignments.Basic;

import java.util.Scanner;

public class Program_04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base of the Isosceles rectangle: ");
        float base = in.nextFloat();
        System.out.print("Enter the height of the Isosceles rectangle: ");
        float height = in.nextFloat();

        float area = (float) (0.5 * base * height);
        System.out.println("The area of the Isosceles rectangle is: " + area);
    }
}
