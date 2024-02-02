package A04_functions.assignments;

import java.util.Scanner;

public class Program_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three numbers: ");

        // taking the inputs of the variables
        int firstNum = in.nextInt();
        int secondNum = in.nextInt();
        int thirdNum = in.nextInt();

        int maxFirstMethod = maxOfThree(firstNum, secondNum, thirdNum);
        System.out.printf("The max of the three numbers (Method 1) is: %d\n", maxFirstMethod);

        int maxSecondMethod = maxOfThreeBetter(firstNum, secondNum, thirdNum);
        System.out.printf("The max of the three numbers (Method 2) is: %d", maxSecondMethod);
    }

    // 1st Function for defining the maximum of three of the number
    public static int maxOfThree(int num1, int num2, int num3) {
        if (num1 > num2) {
            if (num3 > num1) {
                return num3;
            } else return num1;
        } else {
            if (num3 > num2) {
                return num3;
            } else return num2;
        }
    }

    // 2nd Function for defining the maximum of three using a simpler approach
    public static int maxOfThreeBetter(int num1, int num2, int num3) {
        int max = num1;

        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        return max;
    }
}
