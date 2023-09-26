// Q12. Perimeter Of Square

package A03_conditionals_loops.assignments;

import java.util.Scanner;

public class Program_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the Square: ");
        int l = in.nextInt();
        int p = 4 * l;
        System.out.println("The perimeter of the Square is: " + p);
    }
}
