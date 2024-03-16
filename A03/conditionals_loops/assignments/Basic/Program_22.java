// Q.22 [Leetcode Q.1281] Given an integer number n, return the difference between the product of its digits and the sum of its digits.

package A03.conditionals_loops.assignments.Basic;

public class Program_22 {
    public static void main(String[] args) {
        int n1 = 234;
        int n2 = 4421;
        int ans = subtractProductAndSum(n1);
        System.out.println("ans for case 1: " + ans);
        ans = subtractProductAndSum(n2);
        System.out.println("ans for case 2: " + ans);
    }

    static int subtractProductAndSum(int n) {
        int a = n;
        int sum = 0;
        int product = 1;
        int ans = 0;
        while (a > 0) {
            int rem = a % 10;
            a = a / 10;
            sum = sum + rem;
            product = product * rem;
        }
        ans = product - sum;
        return ans;
    }
}
