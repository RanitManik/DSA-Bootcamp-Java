// Q12. Calculate Average Marks

package A03__conditionals_loops.assignments.Intermediate;

import java.util.Scanner;

public class Program_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = in.nextInt();

        // Create an array to store the marks
        int[] marks = new int[numSubjects];

        // Get marks for each subject
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = in.nextInt();
        }

        // Calculate the total marks
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }

        // Calculate the average
        double average = (double) totalMarks / numSubjects;

        // Display the average
        System.out.println("Average Marks: " + average);

        in.close();
    }
}
