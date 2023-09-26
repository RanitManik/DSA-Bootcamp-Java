// Q9. Perimeter Of Equilateral Triangle

package A03_conditionals_loops.assignments;

import java.util.Scanner;

public class Program_09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the lengths of equilateral triangle: ");
        int a = in.nextInt();
        int p = 3 * a;
        System.out.println("The Perimeter of the equilateral triangle is: " + p);
    }
}
