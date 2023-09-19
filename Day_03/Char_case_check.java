package Day_03;

import java.util.Scanner;

public class Char_case_check {
    public static void main(String[] args) {
        System.out.print("Input the character: ");
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("This is a lowercase character.");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("This is a uppercase character.");
        } else {
            System.out.println("This is not a valid character.");
        }
    }
}
