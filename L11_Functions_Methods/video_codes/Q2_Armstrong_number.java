package L11_Functions_Methods.video_codes;

// the program will keep taking numbers as inputs from user and tell him whether a number is Armstrong or not.
// if the number is Armstrong, it will print true else it will print false.
// if you want to stop the program, enter "-1"

import java.util.Scanner;

public class Q2_Armstrong_number {
    public static void main(String[] args) {
        while (true) {
            System.out.print("Enter the number: ");
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            boolean ans = isArmstrong(n);
            System.out.println(ans);
            if (n == -1) {
                System.out.println("The program is Stopping...");
                break;
            }
        }
    }

    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem * rem * rem;
        }
        return sum == original;
    }
}
