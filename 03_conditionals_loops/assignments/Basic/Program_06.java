// Q6. Area Of Rhombus

package A03_conditionals_loops.assignments.Basic;

import java.util.Scanner;

public class Program_06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base of the Rhombus: ");
        float a = in.nextFloat();
        System.out.print("Enter the height of the Rhombus: ");
        float b = in.nextFloat();

        float area = (a * b) / 2;
        System.out.println("The area of the Rhombus is: " + area);
    }
}
