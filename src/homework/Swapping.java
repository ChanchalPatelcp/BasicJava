package homework;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		System.out.println(num1+" "+num2);	
		withVariable(num1,num2);
		withoutVariable(num1,num2);
	}
	public static void withVariable(int num1,int num2) {
		int num3=num1;
		num1=num2;
		num2=num3;
		System.out.println(num1+" "+num2);
		
	}	
	public static void withoutVariable(int num1,int num2) {
		num1=num1+num2;//9
		num2=num1-num2;//9-5 = 4
		num1=num1-num2;// 9-4=5
		System.out.println(num1+" "+num2);
		
//		num1,num2 = num2,num1;(only in python)
		
	}

	

}
