package A03_conditionals_loops.src;

import java.util.Scanner;

public class N_th_fibonacci_no {
    public static void main(String[] args) {
        System.out.print("Enter the value of n: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0; // first
        int b = 1; // next
        int count = 1;
        while (count <= n) {
            int temp = b;
            b = a + b;
            a = temp;
            count++;
        }
        System.out.print("The nth fibonacci number is : " + b);
    }
}
