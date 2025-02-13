package array;

import java.util.Scanner;

public class SpanOfArray {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
//	spanOfArray();
//		findElement();
		barChart();

	}

	public static void spanOfArray() {
		int[] arr = { 87, 56, 89, 76, 32 };
		int max = arr[0];
		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
			if (min > arr[i]) {
				min = arr[i];
			}

		}
		int span = max - min;
		System.out.println(span);

	}

	public static void findElement() {
		
		System.out.print("Enter Size of an Array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the Elements of an Array : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter Element to be Find : ");
		int num = sc.nextInt();
		int i= 0;
		while (num != arr[i]) {
			i++;
		}
		if (num == arr[i]) {
			System.out.println("Index of " + num + " is " + i);
		}

	}
	public static void barChart() {
		System.out.println("Enter the size : ");
		int size = sc.nextInt();
		int []arr = new int [size];
		System.out.println("Enter the elements of an array : ");
		for(int i =0 ;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		//for finding the max num 
		int max = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		// for printing the bar chart
		for(int floor = max;floor>=1;floor--) {
			for(int i =0;i<arr.length;i++) {
				if(floor<=arr[i]) {
					System.out.print("*\t");
				}
				else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}

}
