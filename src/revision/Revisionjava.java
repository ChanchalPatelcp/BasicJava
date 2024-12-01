package revision;

import java.util.Scanner;

public class Revisionjava {

	public static void main(String[] args) {
		ifElse();	

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

}
