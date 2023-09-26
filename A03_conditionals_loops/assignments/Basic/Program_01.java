// Q1. Area Of Circle Java Program

package A03_conditionals_loops.assignments.Basic;

import java.util.Scanner;

public class Program_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        int radius = in.nextInt();

        float area = (((float) 22 / 7) * radius * radius);
        System.out.println("The Area of the circle is = " + area);
    }
}
