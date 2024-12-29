package practiceOfPattern;

import java.util.Scanner;

public class IntegerPatterns {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		left();
		fibonacci();
		table();
		diamond();
		vPrint();
		arrow();
		hourGlass();
		swastik() ;
		wPrint();

	}

	public static void left() {
		int k = 1;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(k + " ");
				k++;
			}
			System.out.println();
		}
	}

	public static void fibonacci() {
		int k = 0;
		int l = 1;

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(k + "\t");
				int sum = k + l;

				k = l;
				l = sum;
			}
			System.out.println();
		}

	}

	public static void table() {
		System.out.println("Which table do you want to print?");
		int x = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			int ans = x * i;
			System.out.println(x + " * " + i + " = " + ans);
		}

	}

	public static void diamond() {
		int n = 5;
		int os = 2;
		int k = 1;
		int a = 1;
		int j;

		for (int i = 1; i <= n; i++) {
			for (j = 1; j <= os; j++) {
				System.out.print("\t");
			}
			int b = a;
			for (j = 1; j <= k; j++) {
				System.out.print(b + "\t");
				if (j <= k / 2) {
					b++;

				} else {
					b--;

				}
			}

			if (i <= n / 2) {
				os--;
				k += 2;
				a++;
			} else {
				os++;
				k -= 2;
				a--;
			}

			System.out.println();
		}

	}

	public static void vPrint() {
		System.out.println("Enter Num : ");
		int n = sc.nextInt();
		int str = 1;
		int sp = 2 * n - 3;
		int val = 1;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= str; j++) {
				System.out.print(val + "\t");
				val++;
			}
			for (int j = 1; j <= sp; j++) {
				System.out.print("\t");

			}
			if (i == n) {
				str--;
				val--;
			}
			for (int j = 1; j <= str; j++) {
				val--;
				System.out.print(val + "\t");
			}
			str++;
			sp -= 2;
			System.out.println();
		}

	}

	public static void arrow() {
		int n = 5;
		int sp = 2;
		int str = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sp; j++) {
				if (i == n / 2 + 1) {
					System.out.print("*\t");
				} else {
					System.out.print("\t");
				}
			}
			for (int j = 1; j <= str; j++) {
				System.out.print("*\t");
			}
			if (i <= n / 2) {
				str++;
			} else {
				str--;
			}
			System.out.println();

		}
	}

	public static void hourGlass() {
		System.out.println("Enter Number : ");
		int n = sc.nextInt();
		int str = n;
		int sp = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print("\t");
			}
			for (int j = 1; j <= str; j++) {
				if (i > 1 && i <= n / 2 && j > 1 && j < str) {
					System.out.print("\t");
				} else {
					System.out.print("*\t");
				}
			}
			if (i <= n / 2) {
				sp++;
				str -= 2;
			} else {
				sp--;
				str += 2;
			}
			System.out.println();

		}

	}

	public static void swastik() {
		System.out.println("Enter Odd Number : ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1) {
					if (j <= n / 2 + 1 || j == n) {
						System.out.print("*\t");
					} else {
						System.out.print("\t");
					}

				} else if (i <= n / 2) {
					if (j == n / 2 + 1 || j == n) {
						System.out.print("*\t");
					} else {
						System.out.print("\t");
					}

				} else if (i == n / 2 + 1) {

					System.out.print("*\t");

				} else if (i < n) {
					if (j == n / 2 + 1 || j == 1) {
						System.out.print("*\t");
					} else {
						System.out.print("\t");
					}

				} else {
					if (j >= n / 2 + 1 || j == 1) {
						System.out.print("*\t");
					} else {
						System.out.print("\t");
					}

				}

			}
			System.out.println();
		}
	}

	public static void wPrint() {

		int n = 5;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i <= n / 2 || i == n) {
					if (j == 1 || j == n) {
						System.out.print("*\t");
					} else {
						System.out.print("\t");
					}

				} else if (i == n / 2 + 1) {
					if (j == 1 || j == n || j == n / 2 + 1) {
						System.out.print("*\t");
					} else {
						System.out.print("\t");
					}

				} else if (i < n) {
					if (j < n / 2 + 1 || j > n / 2 + 1) {
						System.out.print("*\t");
					} else {
						System.out.print("\t");
					}

				}
			}
			System.out.println();
		}
	}

}
