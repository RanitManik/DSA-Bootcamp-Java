// Q2. Area Of Triangle

package A03_conditionals_loops.assignments;

import java.util.Scanner;

public class Program_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base of the triangle: ");
        int b = in.nextInt();
        System.out.print("Enter the height of the triangle: ");
        int h = in.nextInt();

        float area = ((float) (1.0 / 2) * (b * h));
        System.out.println("The area of the triangle: is " + area);
    }
}
