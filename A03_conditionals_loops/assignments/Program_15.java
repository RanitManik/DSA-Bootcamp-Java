// Q15. Volume Of Prism

package A03_conditionals_loops.assignments;

import java.util.Scanner;

public class Program_15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base of the prism: ");
        int b = in.nextInt();
        System.out.print("Enter the Height of the prism: ");
        int h = in.nextInt();

        float v = b * h;
        System.out.println("The volume of the prism is: " + v);
    }
}
