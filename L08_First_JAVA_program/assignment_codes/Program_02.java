// Q2. Take a name as input and print a greeting message for that particular name.

package L08_First_JAVA_program.assignment_codes;

import java.util.Scanner;

public class Program_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");

        // taking an input string name ==>
        String name = in.nextLine();

        // printing the greeting message ==>
        System.out.println("Hello " + name);
    }
}
