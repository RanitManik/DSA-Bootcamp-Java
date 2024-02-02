package A04_functions.src;

import java.util.Scanner;

public class add_by_arguments {
    public static void main(String[] args) {
        int ans = sum1(2, 3);
        System.out.println(ans);
    }

    static int sum1(int a, int b) {
        int sum1 = a + b;
        return sum1;
    }

    //    pass the value of number1 & 2 while calling the method in main()
    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = in.nextInt();
        System.out.print("Enter num2: ");
        int num2 = in.nextInt();
        int sum = num2 + num1;
        System.out.println("Addition is: " + sum);
    }
}
