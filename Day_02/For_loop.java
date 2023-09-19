package Day_02;

import java.util.Scanner;

public class For_loop {
    public static void main(String[] args) {
        /*
    syntax for loops :
    for(initialization;condition;update)
    ------------------------------------
    Q. Print the numbers from 1 to 10
     */
        System.out.println("I am printing 1 to 10");
        for (int num = 1; num < 11; num++) {
            System.out.print(num+" ");
        }
        /*
        Q. Print numbers from 1 to n
         */
        System.out.println(" ");
        System.out.print("Enter the value of n: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i < n + 1; i++) {
            System.out.print(i+" ");
        }
    }
}
