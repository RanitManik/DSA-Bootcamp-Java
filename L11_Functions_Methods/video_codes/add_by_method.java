package L11_Functions_Methods.video_codes;

import java.util.Scanner;

public class add_by_method {
    public static void main(String[] args) {
        sum();

    }

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

