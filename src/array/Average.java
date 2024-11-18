package array;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.print("Enter numbers : ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}

		double average = sum / arr.length;
		System.out.print("Average of array is : " + average);
	}

}
