package day3;

public class Methods {
	public static void main(String[] args) {
		 
		method1();
		String a =str();
		
		System.out.println(a);
		method2(12,13);
		
		int b =method3(56,45);
		System.out.println(b);
		
	}
	//return nothing take nothing
	static void method1() {
		System.out.println("Hello!");
	}
	//return something take nothing
	static String str() {
		return "hello";
	}
	//return nothing take something
	static void method2(int a,int b) {
		
		System.out.println(a+b);
	}
	//return something take something
	static int method3(int a,int b) {
		 int c=a*b;
		return c;
	}
}
