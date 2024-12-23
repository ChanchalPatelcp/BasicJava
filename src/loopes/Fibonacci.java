package loopes;

import java.util.Scanner;

public class Fibonacci {
	static Scanner scan = new Scanner(System.in);

	// 0 1 1 2 3 5 8 13 21 34

	public static void main(String[] args) {
		fibonacci();
		fibonacci1();
		
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

	
}
