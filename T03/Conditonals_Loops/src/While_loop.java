package T03.Conditonals_Loops.src;

import java.util.Scanner;

public class While_loop {
    /*
    Q. This program will print Hello World for n times using while loop
     */
    public static void main(String[] args) {
        System.out.print("Enter How many times you want to print Hello World: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 1;
        while (i < n + 1) {
            System.out.println("Hello World");
            i++;
        }
    }
}
