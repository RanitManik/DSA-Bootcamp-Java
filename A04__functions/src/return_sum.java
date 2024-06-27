package A04__functions.src;

import java.util.Scanner;

public class return_sum {
    public static void main(String[] args) {
        int ans = sum();
        System.out.print("The sum is :" + ans);
    }

    static int sum() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = in.nextInt();
        System.out.print("Enter num2: ");
        int num2 = in.nextInt();
        return num2 + num1;
    }
}
//return statement is the last statement
