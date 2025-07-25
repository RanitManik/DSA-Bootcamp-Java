package A14__recursion;

public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println(GetNthFibonacciNumber(7));
    }

    static int GetNthFibonacciNumber(int n) {
//        // base condition 0
//        if (n == 0) {
//            return 0;
//        }
//        // Base condition 1
//        if (n == 1) {
//            return 1;
//        }

        // Optimized Approach
        if (n < 2) {
            return n;
        }

        return GetNthFibonacciNumber(n - 1) + GetNthFibonacciNumber(n - 2);
    }
}
