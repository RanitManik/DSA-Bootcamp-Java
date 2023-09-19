package L8_First_JAVA_program;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int sum = num2 + num1;
        System.out.println("Sum is = " + sum);
    }
}
