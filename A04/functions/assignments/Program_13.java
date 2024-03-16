package A04.functions.assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class Program_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number lower bound of the interval ==> ");
        int lb = in.nextInt();
        System.out.print("Enter the number higher bound of the interval ==> ");
        int ub = in.nextInt();

        ArrayList<Integer> primeNumbers = isPrime(lb, ub);
        System.out.println("Prime numbers in the given interval: " + primeNumbers);
    }

    public static ArrayList<Integer> isPrime(int lb, int ub) {
        ArrayList<Integer> arrayOfPrime = new ArrayList<>();
        for (int i = lb; i <= ub; i++) {
            if (i == 1 || i == 0)
                continue;
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                arrayOfPrime.add(i);
            }
        }
        return arrayOfPrime;
    }
}
