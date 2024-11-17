package array;

import java.util.Scanner;

public class PrintMiddleElement {

	public static void main(String[] args) {
		//print middle element of single array
		singleDimention();
		multiDimention();
	}

	public static void singleDimention() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int Size = sc.nextInt();
		int num[] = new int[Size];
		System.out.print("Enter elements : ");
		for (int i = 0; i < Size; i++) {
			num[i] = sc.nextInt();

		}
		for (int i = 0; i < Size; i++)
			System.out.print(num[i] + " , ");
		System.out.println("Middle element of " + Size + " is = " + num[Size / 2]);
	}
	public static void multiDimention () {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Row and Column");
		int size1 = sc.nextInt();
		int size2 = sc.nextInt();
		
		int arr[][] = new int[size1][size2];
		System.out.print("Enter the elements "+size1*size2+" : ");
		
		for(int i =0;i<size1;i++) {
			for(int j =0;j<size2;j++) {
				arr[i][j]= sc.nextInt();
			}
				
		}
		System.out.println("Elements of array : ");
		for(int i =0;i<size1;i++) {
			for(int j=0;j<size2;j++) {
				System.out.print(arr[i][j]+" , ");
			}
			System.out.println();
			
		}
		
		
		
	}
}
