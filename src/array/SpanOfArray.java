package array;

import java.util.Scanner;

public class SpanOfArray {

	public static void main(String[] args) {
//	spanOfArray();
		findElement();

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
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of an Array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the Elements of an Array : ");
		for (int i = 0; i < size; i++) {
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

}
