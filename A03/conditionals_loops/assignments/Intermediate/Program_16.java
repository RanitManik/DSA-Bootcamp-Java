// Q16. Reverse A String In Java

package A03.conditionals_loops.assignments.Intermediate;

import java.util.Scanner;

public class Program_16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = in.nextLine();

        String reversed = reverseString(input);

        System.out.println("Reversed string: " + reversed);

        in.close();
    }

    static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }

        return new String(charArray);
    }
}
