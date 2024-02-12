// Q3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

package A01_first_java.assignments;

import java.util.Scanner;

public class Program_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.print("Enter the principal: ");
        int P = in.nextInt();
        System.out.print("Enter the rate of interest: ");
        int T = in.nextInt();
        System.out.print("Enter the time: ");
        int R = in.nextInt();


        System.out.println("simple interest = " + ((P * T * R) / 100));
    }
}
