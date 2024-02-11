// Q5. Take 2 numbers as input and print the largest number.

package A02_first_java.assignments;

import java.util.Scanner;

public class Program_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first_number = in.nextInt();
        System.out.print("Enter first number: ");
        int second_number = in.nextInt();

        if (first_number < second_number) {
            System.out.printf("the largest number is ==> %d ", second_number);
        } else if (first_number > second_number) {
            System.out.printf("%d is the largest number", first_number);
        } else System.out.println("Enter some valid number..");
    }
}
