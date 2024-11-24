package array;

import java.util.Scanner;

public class MatrixMultiply {

	public static void main(String[] args) {
//		multiply();
		division();
	}
	public static void multiply() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of Rows and no. of Columns of Matrix A : ");
		int row1 = sc.nextInt();
		int col1 = sc.nextInt();
		
		System.out.println("Enter no. of Rows and no. of Columns of Matrix B : ");
		int row2 = sc.nextInt();
		int col2 = sc.nextInt();
		
		int mat1[][] = new int[row1][col1];
		int mat2[][] = new int[row2][col2];
		int c[][] = new int[row1][col2];
		
		System.out.println("Enter Elements of Matrix A : ");
		for(int i =0;i<row1;i++) {
			for(int j=0;j<col1;j++) {
				mat1[i][j] = sc.nextInt();
				
			}
		}
		System.out.println("Enter Elements of Matrix B : ");
		for(int i =0;i<row2;i++) {
			for(int j=0;j<col2;j++) {
				mat2[i][j] = sc.nextInt();
				
			}
		}
		System.out.println("Multiplication of Matrix A and Matrix B is : ");
		for(int i=0;i<row1;i++) {
			for(int j=0;j<col2;j++) {
				c[i][j] = 0; // temp=0
				for(int k=0;k<row2;k++) {
					c[i][j] = c[i][j] + mat1[i][k]*mat2[k][j];
				}
				System.out.print(c[i][j]+"  ");
			}
			System.out.println();
		}
		
	
	
	
	}
	public static void division() {
		int arr[][] = {{3,2},{3,4}};
		int arr1[][] = {{4,3},{2,6}};
		
		for(int i=0;i<arr.length;i++) {
			for(int j =0;j<arr1.length;j++) {
				System.out.print(arr[i][j]/arr1[i][j]);
			}
			System.out.println();
		}
	
	}

}
