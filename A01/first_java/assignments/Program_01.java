// Q1. Write a program to print whether a number is even or odd, also take input from the user.

package A01.first_java.assignments;

import java.util.Scanner;

public class Program_01 {
    public static void main(String[] args) {

        System.out.print("Enter the number you want to check ==> ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else
            System.out.println("The program is odd.");
    }
}
