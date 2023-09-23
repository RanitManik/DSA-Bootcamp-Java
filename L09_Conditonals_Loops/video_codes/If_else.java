package L09_Conditonals_Loops.video_codes;

import java.util.Scanner;

public class If_else {
    /*   This program will take a input of your base salary and
    if the salary > 25000 it will add 2000 else it will add 4000 and print the net salary   */
    public static void main(String[] args) {
        System.out.print("please Enter the base salary: ");
        Scanner input = new Scanner(System.in);
        int salary = input.nextInt();
        if (salary > 25000) {
            salary = salary + 2000;
        } else {
            salary = salary + 4000;
        }
        System.out.println("The total salary is: " + salary);
    }
}
