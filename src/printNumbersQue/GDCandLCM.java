package printNumbersQue;

import java.util.Scanner;

public class GDCandLCM {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// printLCMandGDC();
		// FactPrimeNum();
//		pythagorous();
		bulbOn();
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

	public static void pythagorous() {
		System.out.print("Enter three integers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d;

		if (a > b && a > c) {
			d = a;
			a = b;
			b = c;
		} else if (b > a && b > c) {
			d = b;
			b = a;
			a = c;
		} else {
			d = c;

		}

		int H = d * d;

		int PB = a * a + b * b;

		if (H == PB) {
			System.out.print("Hence its satisfying the Pythagorous Theorem.Therefore its a Right Angle Triangle");
		} else {
			System.out.println("It doesnt satisfy Pythagorous Theorem.Therefore its not a Right Angle Triangle");
		}

	}
	public static void bulbOn() {
		int n = sc.nextInt();
		for(int i =1;i<=n;i++) {
			System.out.println(i*i);
		}
	}

}
