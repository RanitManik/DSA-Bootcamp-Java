package A04.functions.assignments;

import java.util.Scanner;

public class Program_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number you want to check: ");

        int num = in.nextInt();

        String message_Or = (checkEven_Or(num)) ? "Even Number" : "Odd Number";
        System.out.println(message_Or);

        String message_And = (checkEven_And(num)) ? "Even Number" : "Odd Number";
        System.out.println(message_And);
    }

    // checking if the number is an Even or Odd through Bitwise 'OR' (|) Operator
    static boolean checkEven_Or(int number) {
        return (number | 1) > number;
    }

    // checking if the number is an Even or Odd through Bitwise 'And' (&) Operator
    static boolean checkEven_And(int number) {
        return (number & 1) != 1;
    }
}