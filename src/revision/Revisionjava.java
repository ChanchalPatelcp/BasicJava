package revision;

import java.util.Scanner;

public class Revisionjava {

	public static void main(String[] args) {
		ifElse();
		System.out.println();
		operators();

	}
	public static void ifElse() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num = sc.nextInt();
		if(num%2==0) {
			System.out.print(num+" is even number. ");
		}
		else {
			System.out.print(num+" is odd number.");
		}
		
	}
	public static void operators() {
		int a=4;
		int b=2;
		
		System.out.println(a+b);
		System.out.print(a-b);
	}

}
