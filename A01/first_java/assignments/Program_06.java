// Q6. Input currency in rupees and output in USD.

package A01.first_java.assignments;

import java.util.Scanner;

public class Program_06 {
    public static void main(String[] args) {
        System.out.print("Enter the amount in rupees: ");
        Scanner in = new Scanner(System.in);

        int rupees = in.nextInt();
        int dollar = (75 * rupees);
        System.out.println("The amount in dollar is: " + dollar);

        String result = convertNumberToString(dollar);
        System.out.println("amount of dollars as string: " + result);
    }

    public static String convertNumberToString(int number) {
        String[] units = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] teens = {"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        if (number == 0) {
            return "zero";
        } else if (number < 10) {
            return units[number];
        } else if (number < 20) {
            return teens[number - 11];
        } else if (number < 100) {
            return tens[number / 10] + (number % 10 != 0 ? " " + units[number % 10] : "");
        } else if (number < 1000) {
            return units[number / 100] + " hundred" + (number % 100 != 0 ? " and " + convertNumberToString(number % 100) : "");
        } else if (number < 1000000) {
            return convertNumberToString(number / 1000) + " thousand" + (number % 1000 != 0 ? " " + convertNumberToString(number % 1000) : "");
        } else {
            return "Number out of range";
        }
    }
}
