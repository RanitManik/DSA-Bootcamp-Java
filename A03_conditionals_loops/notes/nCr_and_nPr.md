# nCr (combination) and nPr (permutation):

```java
import java.util.Scanner;

public class CombinationPermutationCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        System.out.print("Enter the value of r: ");
        int r = scanner.nextInt();

        long nCr = calculateNcr(n, r);
        long nPr = calculateNpr(n, r);

        System.out.println("nCr (" + n + " choose " + r + ") = " + nCr);
        System.out.println("nPr (" + n + " permute " + r + ") = " + nPr);

        scanner.close();
    }

    // Method to calculate nCr
    static long calculateNcr(int n, int r) {
        // Base cases
        if (r > n) return 0;
        if (r == 0 || n == r) return 1;

        // Dynamic programming table to store results
        long[][] dp = new long[n + 1][r + 1];

        // Initialize base cases
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }

        // Fill up the table using dynamic programming
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= Math.min(i, r); j++) {
                dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
            }
        }

        // Return the result
        return dp[n][r];
    }

    // Method to calculate nPr
    static long calculateNpr(int n, int r) {
        // Base case
        if (r > n) return 0;

        // Initialize result to 1
        long result = 1;

        // Calculate nPr using loop
        for (int i = 0; i < r; i++) {
            result *= (n - i);
        }

        // Return the result
        return result;
    }
}
```

## Explanation:

1. **Import Statement**:
   `import java.util.Scanner;`: This statement imports the `Scanner` class from the `java.util` package, which is
   used for taking input from the user.

2. **Class Declaration**:
   `public class CombinationPermutationCalculator { ... }`: This defines a public class
   named `CombinationPermutationCalculator`.

3. **Main Method**:
   `public static void main(String[] args) { ... }`: This is the entry point of the program. It prompts the user to
   enter values for `n` and `r`, calculates both nCr and nPr, and prints the results.

4. **Taking User Input**:
   `Scanner scanner = new Scanner(System.in);`: This creates a new `Scanner` object to read input from the console.

5. **Getting Values of n and r**:
   `int n = scanner.nextInt();` and `int r = scanner.nextInt();`: These lines prompt the user to enter the values
   of `n` and `r`, and then store those values in the variables `n` and `r`, respectively.

6. **Calculating nCr**:
   `long nCr = calculateNcr(n, r);`: This calls the `calculateNcr` method (explained later) to compute the
   combination (nCr) and stores the result in the variable `nCr`.

7. **Calculating nPr**:
   `long nPr = calculateNpr(n, r);`: This calls the `calculateNpr` method (explained later) to compute the
   permutation (nPr) and stores the result in the variable `nPr`.

8. **Printing Results**:
   `System.out.println("nCr (" + n + " choose " + r + ") = " + nCr);`
   and `System.out.println("nPr (" + n + " permute " + r + ") = " + nPr);`: These lines print out the calculated
   values of nCr and nPr along with informative messages.

9. **Closing the Scanner**:
   `scanner.close();`: This line closes the `Scanner` to free up system resources.

10. **Method for Calculating nCr** (`calculateNcr`):

    This method uses dynamic programming to calculate the combinations (nCr). It handles base cases, initializes a 2D
    array to store results, and fills up the table using dynamic programming.

11. **Method for Calculating nPr** (`calculateNpr`):

   This method calculates permutations (nPr) using a loop. It multiplies `n` with `n-1`, `n-2`, and so on, `r` times.
   
   Overall, this program provides a user-friendly interface for calculating both combinations (nCr) and permutations (
   nPr)
   for given values of `n` and `r`.

---