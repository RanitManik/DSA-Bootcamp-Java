package A04.functions.assignments;

import java.util.Scanner;

public class Program_07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the  number: ");
        int number = in.nextInt();

        String result = (isPrime(number)) ? "prime number" : "composite number";
        System.out.println(result);
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
