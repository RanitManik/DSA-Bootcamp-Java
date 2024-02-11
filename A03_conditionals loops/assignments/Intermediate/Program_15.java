package A03_conditionals_loops.assignments.Intermediate;

import java.util.Scanner;

public class Program_15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = in.nextInt();

        System.out.print("Enter the value of r: ");
        int r = in.nextInt();

        long nCr = calculateNcr(n, r);
        long nPr = calculateNpr(n, r);

        System.out.println("nCr (" + n + " choose " + r + ") = " + nCr);
        System.out.println("nPr (" + n + " permute " + r + ") = " + nPr);

        in.close();
    }

    static long calculateNcr(int n, int r) {
        if (r > n) return 0;
        if (r == 0 || n == r) return 1;

        long[][] dp = new long[n + 1][r + 1];

        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= Math.min(i, r); j++) {
                dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
            }
        }

        return dp[n][r];
    }

    static long calculateNpr(int n, int r) {
        if (r > n) return 0;

        long result = 1;

        for (int i = 0; i < r; i++) {
            result *= (n - i);
        }

        return result;
    }
}

