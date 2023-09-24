package A03_conditionals_loops.src;

import java.util.Scanner;

public class Multiple_if_else {
    /*  This program will take a input of your base salary and
    if the salary > 25000 it will add 2000 else if salary < 10000
    it will add 4000 and else if salary is between 10000 and 25000
    it will add 3000 and print the net salary   */
    public static void main(String[] args) {
        System.out.print("Enter your base salary: ");
        Scanner input = new Scanner(System.in);
        int salary = input.nextInt();
        if (salary > 25000) {
            salary += 2000;
        } else if (salary < 10000) {
            salary += 4000;
        } else
            salary += 3000;
        System.out.println("The total salary is: " + salary);
    }
}
