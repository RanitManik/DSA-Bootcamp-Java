// Q1. Write a program to print whether a number is even or odd, also take input from the user.

package L08_First_JAVA_program.assignment_codes;

import java.util.Scanner;

public class Program_01 {
    public static void main(String[] args) {

        // taking input from the user ==>
        System.out.print("Enter the number you want to check ==> ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        // checking if the number is even or odd ==>
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else
            System.out.println("The program is odd.");
    }
}
