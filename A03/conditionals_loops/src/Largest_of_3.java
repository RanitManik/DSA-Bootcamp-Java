package A03.conditionals_loops.src;

import java.util.Scanner;

public class Largest_of_3 {
    public static void main(String[] args) {
        System.out.println("Enter the three numbers: ");
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        /*
        Q. Find the largest of three numbers
         */

        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println("The largest no is: " + max);
    }
}
