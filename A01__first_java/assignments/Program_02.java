// Q2. Take a name as input and print a greeting message for that particular name.

package A01__first_java.assignments;

import java.util.Scanner;

public class Program_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");


        String name = in.nextLine();

        System.out.println("Hello " + name);
    }
}
