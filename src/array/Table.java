package array;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int N = sc.nextInt();
		
		System.out.print("Enter the size of Table : ");
		int size = sc.nextInt();
		
		System.out.println("Table of " + N + " is : ");
		
		int num[] = new int[size];

		for (int i = 0; i < size; i++) {
			num[i] = N * (i + 1);
			System.out.print(num[i] + " ");

		}
	

	}

}
