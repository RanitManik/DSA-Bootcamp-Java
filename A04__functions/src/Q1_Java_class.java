package A04__functions.src;

// the program will keep taking numbers as inputs from user and tell him whether a number is prime or not.
// if the number is prime, it will print true else it will print false.
// if you want to stop the program, enter "-1"

import java.util.Scanner;

public class Q1_Java_class {
    public static void main(String[] args) {
        while (true) {
            System.out.print("Enter the number: ");
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            boolean ans = isPrime(n);
            System.out.println(ans);
            if (n == -1) {
                System.out.println("The program is Stopping...");
                break;
            }
        }
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > n;
    }
}
