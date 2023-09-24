package T03_Conditonals_Loops.src;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.print("Enter the operator: ");
        Scanner in = new Scanner(System.in);
        //Take input from user till he doesn't press "X" or "x"
        char op = in.next().trim().charAt(0);
        int ans = 0;
        while (true) {
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("Enter the first number: ");
                int num1 = in.nextInt();
                System.out.print("Enter the first number: ");
                int num2 = in.nextInt();
                //operations
                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    ans = num1 / num2;
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("This is not a valid operator");
            }
            System.out.println("The answer is: " + ans);
        }
    }
}
