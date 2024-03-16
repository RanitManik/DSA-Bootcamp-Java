package A04.functions.assignments;

import java.util.Scanner;

public class Program_08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Marks: ");

        int marks = in.nextInt();
        String marksValidate = (marks <= 100) ? "" : "Please Enter a valid number";
        System.out.print(marksValidate);

        System.out.print("The grade you got is: " + checkGrade(marks));
    }

    public static String checkGrade(int marks) {
        if (marks >= 91 && marks <= 100) {
            return "AA";
        } else if (marks >= 81 && marks <= 90) {
            return "AB";
        } else if (marks >= 71 && marks <= 80) {
            return "BB";
        } else if (marks >= 61 && marks <= 70) {
            return "BC";
        } else if (marks >= 51 && marks <= 60) {
            return "CD";
        } else if (marks >= 41 && marks <= 50) {
            return "DD";
        } else {
            return "Fail";
        }
    }
}
