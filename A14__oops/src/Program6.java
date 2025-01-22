package A14__oops.src;// Write a Java program to read two matrices from the keyboard and find the sum of the matrices.

import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Number of Rows for the matrices");
		int rows = scanner.nextInt();
		
		System.out.println("Enter Number of Columns for the matrices");
		int cols = scanner.nextInt();
		
		int matrix1[][] = new int[rows][cols];
		int matrix2[][] = new int[rows][cols];
		int sumMatrix[][] = new int[rows][cols];
		
		System.out.println("\nEnter Elements for the first matrix one by one =>");
		for	(int row = 0; row < rows; row++) {
			for (int col = 0; col < cols; col++) {
				System.out.println("Enter element for " + (row + 1) + " th row and " + (col + 1) + " th column");
				matrix1[row][col] = scanner.nextInt();
			}
		}
		
		System.out.println("\nEnter Elements for the second matrix one by one =>");
		for	(int row = 0; row < rows; row++) {
			for (int col = 0; col < cols; col++) {
				System.out.println("Enter element for " + (row + 1) + " th row and " + (col + 1) + " th column");
				matrix2[row][col] = scanner.nextInt();
			}
		}
		
		System.out.println("\nPrinting the second Matrix =>");
		for	(int row[] : matrix2) {
			for (int col : row) {
				System.out.printf(col + " ");
			}
			System.out.println();
		}

		System.out.println("\nPrinting the first Matrix =>");
		for	(int[] row : matrix1) {
			for (int col : row) {
				System.out.printf(col + " ");
			}
			System.out.println();
		}
		
		for	(int row = 0; row < rows; row++) {
			for (int col = 0; col < cols; col++) {
				sumMatrix[row][col] = matrix1[row][col] + matrix2[row][col];
			}
		}
		
		System.out.println("\nPrinting the sum Matrix =>");
		for	(int[] row : sumMatrix) {
			for (int col : row) {
				System.out.printf(col + " ");
			}
			System.out.println();
		}
	}
}
