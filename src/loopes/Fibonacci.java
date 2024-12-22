package loopes;

import java.util.Scanner;

public class Fibonacci {
	static Scanner scan = new Scanner(System.in);

	// 0 1 1 2 3 5 8 13 21 34

	public static void main(String[] args) {
//		fibonacci();
//		fibonacci1();
//		countDigits();
//		digitsOfNumber();
		reverseNum();
	}

//in simple way 
	public static void fibonacci() {
		System.out.print("Enter a limit of Fabonacci series : ");
		int num = scan.nextInt();
		int k = 0;
		int j = 1;
		int c;

		for (int i = 1; i <= num; i++) {

			System.out.print(k + ",");
			c = k + j;
			k = j;
			j = c;

		}

	}

	// by another method
	public static void fibonacci1() {
		int prev = scan.nextInt();
		if (prev == 1) {
			System.out.println(0);
		} else if (prev == 2) {
			System.out.print(0 + " " + 1 + " ");
		} else {
			int p = 0;
			int q = 1;
			System.out.print(p + " " + q + " ");
			for (int i = 3; i <= prev; i++) {
				double sum = p + q;
				System.out.print(sum + " ");
				p = q;
				q = (int) sum;
			}

		}

	}

	public static void countDigits() {
		System.out.println("Enter numbers : ");
		long num = scan.nextLong();
		int dig = 0;
		while (num != 0) {
			num = num / 10;
			dig++;
		}
		System.out.println("The number of Digits in given Number is " + dig);

	}

	public static void digitsOfNumber() {
		System.out.println("Enter a Number : ");
		int n = scan.nextInt();
		int temp = n;
		int dig = 0;

		while (temp != 0) {
			temp = temp / 10;
			dig++;
		}
		int div = (int) Math.pow(10, dig - 1);
		while (div != 0) {
			System.out.println(n / div);
			n = n % div;
			div = div / 10;
		}

	}

	public static void reverseNum() {
		System.out.println("Enter a Number : ");
		int n = scan.nextInt();

		while (n != 0) {
			System.out.println(n % 10);
			n = n / 10;

		}

	}

}
