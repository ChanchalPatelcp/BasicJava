package array;

import java.util.Scanner;

public class SpanOfArray {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
//	spanOfArray();
//		findElement();
//		barChart();
		sumOfTwoArray();

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
	public static void sumOfTwoArray() {
		System.out.println("Enter the size of Array 1 : ");
		int n1 = sc.nextInt();
		int []arr1 = new int [n1];
		System.out.println("Enter Elements : ");
		for(int i =0 ;i<n1;i++) {
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("Enter the size of Array 2 : ");
		int n2 = sc.nextInt();
		int []arr2 = new int [n2];
		System.out.println("Enter Elements : ");
		for(int i =0 ;i<n2;i++) {
			arr2[i]=sc.nextInt();
		}
		
		int i = n1-1;
		int j = n2-1;
		int sum = 0;
		System.out.println(i+"and"+j);
		
		while(i>=0 || j>=0) {
			 sum = arr1[i] + arr2[j];
			i--;
			j--;
			if(i<0) {
				sum = arr2[j];
			}
			if(j<0) {
				sum = arr1[i];
			}
			System.out.print(sum+"\t");
		}
		
	}

}
