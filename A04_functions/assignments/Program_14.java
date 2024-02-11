package A04_functions.assignments;

import java.util.Scanner;

public class Program_14 {
    public static void main(String[] args) {

        System.out.print("Enter the value of n ==> ");
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        System.out.println(findSum(n));
    }

    // Returns sum of first n natural numbers
    static int findSum(int n) {
        return n * (n + 1) / 2;
    }
}
