package day2;

import java.util.Scanner;
public class Operators {

	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the value :");
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		arithmetic(a,b);
		comparison(a,b);
		
		

	}
	
	private static void arithmetic(int a, int b) {
		System.out.println("Arithmetic Operators");
		// + ,-,*,/,% these are the arithmetic operators used to perform any type of mathematical operations 
		
		System.out.println(a+"+"+b+"="+(a+b));
		System.out.println(a+"-"+b+"="+(a-b));
		System.out.println(a+"*"+b+"="+(a*b));
		System.out.println(a+"/"+b+"="+(a/b));
		System.out.println(a+"%"+b+"="+(a%b));
	}
	private static void comparison(int a , int b) {
		System.out.println("comparison operator");
		// ==,<,>,<=,>=,!=
		System.out.println(a+ "=="+b+"="+(a==b));
		System.out.println(a+"<"+b+"="+(a<b));
		System.out.println(a+">"+b+"="+(a>b));
		System.out.println(a+"<="+b+"="+(a<=b));
		System.out.println(a+">="+b+"="+(a>=b));
		System.out.println(a+"!="+b+"="+(a!=b));
	}
	

}
