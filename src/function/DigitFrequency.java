package function;

import java.util.Scanner;

public class DigitFrequency {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a num : ");
		int n = sc.nextInt();
		System.out.println("Enter a digit : ");
		int d = sc.nextInt();
//		int f = digit(n, d);
//		System.out.println(f);
//		int g = decimalToAnyBase(n, d);
//		System.out.println(g);
		int h = anyBasetoDecimal(n,d) ;
		System.out.println(h);
	}

	public static int digit(int n, int d) {

		int count = 0;
		while (n != 0) {
			int rem = n % 10;
			n = n / 10;
			if (rem == d) {
				count++;
			}
		}
		return count;
	}

	public static int decimalToAnyBase(int n, int d) {
		int p = 1;
		int dtb = 0;
		while (n != 0) {
			int rem = n % d;
			dtb += rem * p;
			p = p * 10;
			n = n / d;
		}
		return dtb;

	}
	public static int anyBasetoDecimal(int n, int d) {
		int p =1;
		int pow = 0;
		while(n!=0) {
			int rem = n%10;
			 pow += rem * p;
			p = p*d;
			n = n / 10;
		}
		return pow;
	}
	public static void anyBasetoAnyBase() {
		
	}
	

}
