package ifelse;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num1 :\nEnter num2 :");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		System.out.println("Choose oprations : \n 1: Add\n 2: Substract \n 3 : multiply\n 4 : divide ");
		int operation = sc.nextInt();

//		if(operation == 1) {
//			System.out.println(num1+"+"+num2+"="+(num1+num2));
//		}
//		else if (operation == 2) {
//			System.out.println(num1+"-"+num2+"="+(num1-num2));
//		}
//		else if( operation ==3) {
//			System.out.println(num1+"*"+num2+"="+(num1*num2));
//			
//		}
//		else if (operation == 4) {
//			System.out.println(num1+"/"+num2+"="+(num1/num2));
//		}else {
//			System.out.println("Invalid Operations");
//		}

		switch (operation) {

		case 1:
			System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
			break;
		case 2:
			System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
			break;
		case 3:
			System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
			break;
		case 4:
			System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
			break;
		default:
			System.out.println("Invalid Operations");

		}

	}
}
