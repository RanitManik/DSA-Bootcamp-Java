package A03__conditionals_loops.src;

import java.util.Scanner;

public class Largest_of_3_using_library {
    public static void main(String[] args) {
        System.out.println("Enter the 3 numbers: ");
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        /*
        Q. Find the largest of three numbers using the Math library
         */
        System.out.println(Math.max(a,Math.max(b,c)));
    }
}
