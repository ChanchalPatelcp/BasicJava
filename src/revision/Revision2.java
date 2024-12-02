package revision;

public class Revision2 {

	public static void main(String[] args) {
		str();
		System.out.println(name());
		num(3,4);
		System.out.println(num1(4,5));
	}
	//take nothing return nothing
	static void str() {
		System.out.println("Hello!");
	}
	//take nothing return something
	static String name() {
		return ("Hello");
	}
	//take something return nothing
	static void num(int a,int b) {
		System.out.println(a+b);
	}
	//take something return something
	static int num1(int a , int b) {
		return (a+b);
	}

}
