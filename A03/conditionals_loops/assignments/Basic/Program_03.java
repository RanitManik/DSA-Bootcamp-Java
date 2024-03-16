// Q3. Area Of Rectangle Program

package A03.conditionals_loops.assignments.Basic;

import java.util.Scanner;

public class Program_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base of the rectangle: ");
        float a = in.nextFloat();
        System.out.print("Enter the height of the rectangle: ");
        float b = in.nextFloat();

        float area = a * b;
        System.out.println("The area of the rectangle is: " + area);
    }
}
