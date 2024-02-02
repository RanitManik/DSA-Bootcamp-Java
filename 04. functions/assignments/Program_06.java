package A04_functions.assignments;

import java.util.Scanner;

public class Program_06 {
    private static final float pi = 3.1415F; // literal

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        float radius = in.nextInt();

        System.out.println("The area of circle: " + areaOfCircle(radius));
        System.out.println("The circumference of circle: " + circumferenceOfCircle(radius));
    }

    static float areaOfCircle(float rad) {
        return (pi * rad * rad);
    }

    static float circumferenceOfCircle(float rad) {
        return (2 * pi * rad);
    }
}
