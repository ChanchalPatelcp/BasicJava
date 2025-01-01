package function;

import java.util.Scanner;

public class DigitFrequency {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a num : ");
		int n = sc.nextInt();
		System.out.println("Enter a digit : ");
		int d = sc.nextInt();
		int f = digit(n, d);
		System.out.println(f);

	}

	public static int digit(int n, int d) {

		int count = 0;
		while (n != 0) {
			int rem = n % 10;
			n = n / 10;
			if (rem == d) {
				count++;
			}
		}
		return count;
	}
	public static void numberSystem() {
		int n = sc.nextInt();
		for(int i =0;i<n;i++) {
			
		}
	}

}
