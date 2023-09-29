package A03_conditionals_loops.assignments.Intermediate;

import java.util.Scanner;

public class Program_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter x-coordinate of first point: ");
        double x1 = in.nextDouble();

        System.out.print("Enter y-coordinate of first point: ");
        double y1 = in.nextDouble();

        System.out.print("Enter x-coordinate of second point: ");
        double x2 = in.nextDouble();

        System.out.print("Enter y-coordinate of second point: ");
        double y2 = in.nextDouble();

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.printf("The distance between the two points is: %.2f", distance);
    }
}
