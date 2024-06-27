// Q5. Area Of Parallelogram

package A03__conditionals_loops.assignments.Basic;

import java.util.Scanner;

public class Program_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base of the Parallelogram: ");
        float base = in.nextFloat();
        System.out.print("Enter the height of the Parallelogram: ");
        float height = in.nextFloat();

        float area = (float) (base * height);
        System.out.println("The area of the Parallelogram is: " + area);
    }
}

