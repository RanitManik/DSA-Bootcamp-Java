// Q10. Calculate CGPA Java Program

package A03_conditionals_loops.assignments.Intermediate;

import java.util.Scanner;

public class Program_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Get the number of courses
        System.out.print("Enter the number of courses: ");
        int numCourses = in.nextInt();

        double totalGradePoints = 0.0;
        int totalCredits = 0;

        for (int i = 1; i <= numCourses; i++) {
            System.out.println("\nCourse " + i + ":");
            System.out.print("Enter grade (A, B, C, D, F): ");
            String grade = in.next();

            System.out.print("Enter credit hours: ");
            int credits = in.nextInt();

            double gradePoints = getGradePoints(grade);
            totalGradePoints += gradePoints * credits;
            totalCredits += credits;
        }

        // Calculate CGPA
        double cgpa = totalGradePoints / totalCredits;

        // Print the result
        System.out.println("\nYour CGPA is: " + cgpa);

        // Close the scanner
        in.close();
    }

    public static double getGradePoints(String grade) {
        return switch (grade.toUpperCase()) {
            case "A" -> 4.0;
            case "B" -> 3.0;
            case "C" -> 2.0;
            case "D" -> 1.0;
            case "F" -> 0.0;
            default -> -1.0; // Invalid grade
        };
    }
}