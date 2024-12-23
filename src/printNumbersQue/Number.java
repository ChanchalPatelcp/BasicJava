package printNumbersQue;

import java.util.Scanner;

public class Number {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		countDigits();
		digitsOfNumber();
		reverseNum();
		inverseOfNum();
		rotateNum();

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

	public static void inverseOfNum() {
		System.out.println("Enter a number: ");// take users input
		int num = scan.nextInt();
		int po = 1;// position of a number started from 1

		int inv = 0;
		while (num > 0) {
			int dig = num % 10;

			inv = inv + po * (int) Math.pow(10, dig - 1);
			num = num / 10;
			po++;

		}
		System.out.println(inv);

	}

	public static void rotateNum() {
		System.out.println("Enter a number : ");
		int n = scan.nextInt();
		System.out.println("How much digits you what to rotate in a number : ");
		int k = scan.nextInt();

		int temp = n;
		int count = 0;
		while (temp != 0) {
			temp = temp / 10;
			count++;

		}
		int div=1 ;
		int multi=1;
		
		k = k%10;//if user want to rotate a number by large value like 352 then we take a remainder 2 and rotate it by 2 .
		if(k<0) {
			k = k + count;//if k is negative number like -2 then we change it to a positive number like -2 + 5 = 3 and then rotate it by 3 .
		}
		for(int i =1;i<=count;i++) {
			if(i<=k) {
				div = div *10;
			}
			else {
				multi = multi * 10;
			}
			
		}
		
		int r = n%div;
		int q = n/div;
		
		int rotateNum = r*multi + q;
		System.out.println("After Rotatation by "+k+" the Number become " +rotateNum);

	}

}
