package loopes;

import java.util.Scanner;

public class Prime {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		//prime();
		printPrime();

	}

	public static void prime() {

		System.out.print("Enter Number : ");
		double num = sc.nextDouble();
		int count = 0;
		for (int i = 2; i * i < num; i++) {
			if (num % i == 0) {
				count++;
				break;
			}
		}
		if (count == 0) {
			System.out.println("Prime Number");
		} else {
			System.out.println("not a Prime");
		}

	}

	public static void printPrime() {
		System.out.print("Enter Starting Number : ");
		int low = sc.nextInt();
		System.out.print("Enter Last Number : ");
		int high = sc.nextInt();

		int count = 0;
		int j;
		int num = 0;
		for (int i = low; i <= high; i++) {
			for (j = 2; j < i; j++) {
				if (i % j == 0) {
					count++;
					break;
				}

			}
			if (count==0) {
				num = i;
				System.out.println(num);

			}

		}
		System.out.println(num);

	}

}
