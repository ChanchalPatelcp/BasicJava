package printNumbersQue;

import java.util.Scanner;

public class GDCandLCM {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// printLCMandGDC();
		FactPrimeNum();
	}

	public static void printLCMandGDC() {

		System.out.println("Enter Two Number : ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int on1 = n1;
		int on2 = n2;

		// GDC - greatest common integer :
		// LCM - least common integer :

		while (n1 % n2 != 0) {
			int rem = n1 % n2;
			n1 = n2;
			n2 = rem;

		}
		int gdc = n2;
		int lcm = on1 * on2 / gdc;
		System.out.println("GDC of " + on1 + " and " + on2 + " is " + gdc);
		System.out.println("LCM of  " + on1 + " and " + on2 + " is " + lcm);

	}

	public static void FactPrimeNum() {
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();

		for (int i = 2; i <= n; i++) {
			while (n % i == 0) {
				n = n / i;
				System.out.print(i + " ");

			}
		}

	}

}
