package A04_functions.assignments;

import java.util.Scanner;

public class Program_04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first numbers: ");
        int num1 = in.nextInt();
        System.out.print("Enter the second numbers: ");
        int num2 = in.nextInt();

        System.out.println("The sum of the given two numbers is: " + sumOfTwo(num1, num2));
    }

    static int sumOfTwo(int num1, int num2) {
        return (num1 + num2);
    }
}
