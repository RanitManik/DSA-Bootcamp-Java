package A03_conditionals_loops.src;

import java.util.Scanner;

public class How_many_same_numbers {
    public static void main(String[] args) {
        System.out.print("Enter the value of number: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.print("Enter the value of number which you want to count : ");
        int p = in.nextInt();
        int count = 0;

        while (n > 0) {
            if (n % 10 == p) {
                count++;
            }
            n = n / 10;
        }

        System.out.println("The digit " + p + " appears " + count + " times in the number.");
    }
}
