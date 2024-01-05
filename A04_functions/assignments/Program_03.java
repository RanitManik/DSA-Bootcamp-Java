package A04_functions.assignments;

import java.util.Scanner;

public class Program_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();

        String message = (number < 18) ? "You cannot Vote." : "You can Vote.";
        System.out.println(message);
    }
}
