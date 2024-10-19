package switchdemo;

import java.util.Scanner;

public class Char {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1 : ");
		System.out.println("Enter num2 : ");

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		System.out.println("Choose Operation : \n +,-,*,/,=");
		char Operation;
		Operation = sc.next().charAt(0);//

		switch (Operation) {

		case '+':
			System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
			break;
		case '-':
			System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
			break;
		case '*':
			System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
			break;
		case '/':
			System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
			break;
		case '=':
			System.out.println(num1 + "=66" + num2 + "=" + (num1 == num2));
			break;
		default:
			System.out.println("Invalid operation.");

		}

	}

}
