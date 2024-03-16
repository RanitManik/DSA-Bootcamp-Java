// Q19. Volume Of Pyramid

package A03.conditionals_loops.assignments.Basic;

import java.util.Scanner;

public class Program_18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base length of the Pyramid: ");
        int bl = in.nextInt();
        System.out.print("Enter the base height of the Pyramid: ");
        int bh = in.nextInt();
        System.out.print("Enter the pyramid height of the Pyramid: ");
        int ph = in.nextInt();

        double v = (bl * bh * ph) / 3.0;
        System.out.println("The volume of the Pyramid is: " + v);
    }
}
