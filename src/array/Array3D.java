package array;

import java.util.Scanner;

// multi matrix multiplication 
public class Array3D {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		multiMatrixMultiplication();

	}

	public static void multiMatrixMultiplication() {

		System.out.println("Enter no. of Matrices : ");
		int num = sc.nextInt();

		int mat1[][] = userInput();

		int resMat[][] = null;

		for (int a = 0; a < num - 1; a++) {
			int mat2[][] = userInput();
			resMat = new int[mat1.length][mat2[0].length];

			for (int i = 0; i < mat1.length; i++) {
				for (int j = 0; j < mat2[0].length; j++) {
					resMat[i][j] = 0;
					for (int k = 0; k < mat2.length; k++) {
						resMat[i][j] += mat1[i][k] * mat2[k][j];

					}
				}

			}
			mat1 = resMat;

		}

		display(resMat);

	}

	public static int[][] userInput() {
		System.out.println("Enter Row and Column : ");
		int row = sc.nextInt();
		int col = sc.nextInt();

		int mat[][] = new int[row][col];

		System.out.println("Enter Elements : ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		return mat;

	}

	public static void display(int mat[][]) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}

}/*
	 * 
	 * 
	 * 
	 * 
	 * 3 1 0 7 2 4 3 2 1
	 * 
	 * 2 1 5 7 3 4
	 * 
	 * 28 14 9 54 21 16
	 * 
	 * 1683 728 2957 1319
	 * 
	 */
