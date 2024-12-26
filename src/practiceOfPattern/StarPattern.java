package practiceOfPattern;

import java.util.Scanner;

public class StarPattern {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
//		right() ;
//		reverse();
//		left();
//		reverse1();
//		diamond();
		daigonal();
	}

	public static void right() {
		System.out.println("Enter a Num :");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}

	}

	public static void reverse() {
		System.out.println("Enter a Num :");
		int n = sc.nextInt();
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}

	}

	public static void left() {
		System.out.println("Enter a Num :");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j <= n - i) {
					System.out.print("_ ");
				} else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}

	public static void reverse1() {
		System.out.println("Enter a Num :");
		int n = sc.nextInt();

		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= n; j++) {
				if (j <= n - i) {
					System.out.print("_ ");
				} else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}

	public static void diamond() {
		/*
		         *
		       * * *
		     * * * * *
		       * * *
		         *
		 */
		System.out.println("Enter a Num :");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == 5) {
					if (j == 3) {
						System.out.print("* ");
					} else {
						System.out.print("_ ");
					}

				} else if (i == 2 || i == 4) {
					if (j == 1 || j == 5) {
						System.out.print("- ");

					} else {
						System.out.print("* ");
					}
				} else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}

	// short code for above pattern
	public static void shortCodeDiamond() {
		System.out.println("Enter a Num :");
		int n = sc.nextInt();
		int sp = n / 2;
		int st = 1;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print("_ ");
			}
			for (int j = 1; j <= st; j++) {
				System.out.print("* ");
			}
			if (i <= n / 2) {
				sp--;
				st += 2;
			} else {
				sp++;
				st -= 2;
			}
			System.out.println();
		}
	}
	public static void daigonal() {
		/*
		 * 
		    *
		       *
		          *
		             *
		*/
		
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		
		for(int i =1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(i==j) {
					System.out.print("*\t");
				}else {
					System.out.print("\t");
				}
			}
			System.out.println();
			
		}
			
		
	}

}
