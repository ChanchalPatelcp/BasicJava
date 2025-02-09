package array;

import java.util.Scanner;

public class AdditionAndSubstraction {

	public static void main(String[] args) {
		Addition(2);
		System.out.println();
		Substraction(2);
	}
	public static void Addition(int size) {
		int arr[][] = new int[size][size];
		int arr1[][] = new int[size][size];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Element of Matrix 1 : ");
		
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				arr[i][j] = sc.nextInt();
			}
			
		}
		System.out.println("Enter the Elements of Matrix 2 : ");
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				arr1[i][j] = sc.nextInt();
			}
			
		}
		System.out.println("Addition of Matrix1 and Matrix2 is : ");
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				System.out.print(arr[i][j]+arr1[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	public static void Substraction(int size) {
		int arr[][] = new int[size][size];
		int arr1[][] = new int[size][size];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Element of Matrix 1 : ");
		
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				arr[i][j] = sc.nextInt();
			}
			
		}
		System.out.println("Enter the Elements of Matrix 2 : ");
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				arr1[i][j] = sc.nextInt();
			}
			
		}
		System.out.println("Substraction of Matrix1 and Matrix2 is : ");
		int matrix[][] = new int[arr1.length][arr1[0].length] ;
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				 matrix[i][j] = arr[i][j] - arr1[i][j];
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
			
		}
		
	}
	

}
