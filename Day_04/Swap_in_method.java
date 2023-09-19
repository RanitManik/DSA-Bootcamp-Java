package Day_04;

import java.util.Scanner;

public class Swap_in_method {
    public static void main(String[] args) {
        System.out.print("enter the value of a and b: ");
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        int q = in.nextInt();
        swap(p, q);
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }
}
