// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

package T02.First_JAVA_program.assignments;

import java.util.Scanner;

public class Program_04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char op = in.next().trim().charAt(0);
        if (op == '+' | op == '-' | op == '*' | op == '/') {
            System.out.print("Enter first integer: ");

        }
    }
}
