// Q4. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

package A01.first_java.assignments;

import java.util.Scanner;

public class Program_04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("This are the valid operators\nEnter the operator: ");
        char op = in.next().trim().charAt(0);
        if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
            System.out.print("Enter first integer: ");
            int first_integer = in.nextInt();
            System.out.print("Enter second number: ");
            int second_integer = in.nextInt();
            if (op == '+') {
                System.out.print("The answer is: " + (first_integer + second_integer));
            }
            if (op == '-') {
                System.out.print("The answer is: " + (first_integer - second_integer));
            }
            if (op == '*') {
                System.out.print("The answer is: " + (first_integer * second_integer));
            }
            if (op == '/') {
                System.out.print("The answer is: " + (first_integer / second_integer));
            }
            if (op == '%') {
                System.out.print("The answer is: " + (first_integer % second_integer));
            }
        } else {
            System.out.println("Invalid operator! 🫥");
        }
    }
}
