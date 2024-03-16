package A04.functions.assignments;

import java.util.Scanner;

public class Program_12 {
    public static void main(String[] args) {
        System.out.print("Enter the three numbers consecutively ==> ");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        if (isPythagorean(num1, num2, num3)) {
            System.out.println("YES the numbers are a set of Pythagorean");
        } else
            System.out.println("NO the numbers are not a set of Pythagorean");
    }

    public static boolean isPythagorean(int number1, int number2, int number3) {
        return Math.pow(number1, 2) + Math.pow(number2, 2) == Math.pow(number3, 2);
    }
}
