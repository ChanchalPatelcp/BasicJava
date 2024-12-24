package practiceOfPattern;

import java.util.Scanner;

public class StarPattern {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
//		right() ;
//		reverse();
//		left();
		reverse1();
	}

	public static void right() {
		System.out.println("Enter a Num :");
		int n = sc.nextInt();
		for(int i =1;i<=n;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
	}
	public static void reverse() {
		System.out.println("Enter a Num :");
		int n = sc.nextInt();
		for(int i =n;i>=1;i--) {
			for(int j = 1;j<=i;j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
	}
	public static void left() {
		System.out.println("Enter a Num :");
		int n = sc.nextInt();
		
		for(int i = 1;i<=n;i++) {
			for(int j = 1;j<=n;j++) {
				if(j<=n-i) {
					System.out.print("_ ");
				}
				else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
	public static void reverse1() {
		System.out.println("Enter a Num :");
		int n = sc.nextInt();
		
		for(int i = n;i>=1;i--) {
			for(int j = 1;j<=n;j++) {
				if(j<=n-i) {
					System.out.print("_ ");
				}
				else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
	
	

}
