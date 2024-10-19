package helloworld;

import java.util.Scanner;
 
public class Calculator {
	public static void main(String[] args) {
		int a , b ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value : ");

		a = sc.nextInt();
		b = sc.nextInt();
		
		arithmetic(a,b);
		assignment(a,b);
		comparision(a,b);		
		conditional();
		
	
	}
	
	private static void conditional( ) {
		System.out.println("And operator");
		System.out.println("True&&True="+(true&&true));
		System.out.println("True&&false="+(true&&false));
		System.out.println("false&&True="+(false&&true));
		System.out.println("false&&false="+(false&&false));
		
		System.out.println("Or operator");
		System.out.println("True||True="+(true||true));
		System.out.println("True||false="+(true||false));
		System.out.println("false||True="+(false||true));
		System.out.println("false||false="+(false||false));
		
		System.out.println("Not operator");
		System.out.println("!True="+(!true));
		System.out.println("!False="+(!false));
	}

	private static void comparision(int a, int b) {
		// ==,<=,>=,<,>,!=
		System.out.println( "comparision operators");
		System.out.println(a+" == " +b+"="+( a==b));
		System.out.println(a+" <= " +b+"="+(a<=b));
		System.out.println(a+" >=" +b+"="+( a>=b));
		System.out.println(a+" <" +b+"="+ (a<b));
		System.out.println(a+" > " +b+"="+ (a>b));
		System.out.println(a+"!="+b+"="+(a!=b));
		
	
	}

	private static void assignment(int a, int b) {
		 
		System.out.println("assingment operator");
		a=b;
		System.out.println("="+a);
		a+=25;
		System.out.println( "+="+a);
		a-=25;
		System.out.println( "-="+a);
		a*=25;
		System.out.println( "*="+a);
		a/=25;
		System.out.println( "/="+a);
		a%=25;
		System.out.println( "%="+a);
	}
	private static void arithmetic (int a,int b) {
		System.out.println("Arithmetic Operators");
		System.out.println(a+"+"+b+"="+(a+b));
		System.out.println(a+"-"+b+"="+(a-b));
		System.out.println(a+"*"+b+"="+(a*b));
		System.out.println(a+"/"+b+"="+(a/b));
		System.out.println(a+"%"+b+"="+(a%b));
	}
	

}

