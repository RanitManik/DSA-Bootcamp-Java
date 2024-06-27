package A08__strings.src;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String: ");

        String str = in.nextLine();

        if (isPalindrome(str)) {
            System.out.printf("The String %s is Palindrome", str);
        } else {
            System.out.printf("The String %s is not Palindrome", str);
        }
    }

    static boolean isPalindrome(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }
        str = str.toLowerCase();
        for (int i = 0; i <= str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);

            if (start != end) {
                return false;
            }
        }
        return true;
    }
}
