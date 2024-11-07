package loopes;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int num =scan.nextInt();
			PrimeNumber pn = new PrimeNumber();
//			pn.nPrime(num);
			pn.primeSqrt(num);

	}
	public void isPrime(int num) {
		int count =2;
		int num1;
		while(count<num) {
			num1=num%count;
			if(num1==0) {
//				System.out.print("Not a prime number");
				break;
			}
			count++;
			
		}
		if(num==count) {
			System.out.print(num+" , ");
		}
		
		
	}
	public void nPrime(int num) {
		PrimeNumber obj = new PrimeNumber();
		
		for(int i=2;i<=num;i++) {
			obj.isPrime(i);	
		}
	}
	
	
	public void primeSqrt(int num) {
		boolean flag = true;
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				System.out.println("Not a prime number");
				flag = false;
				break;
			}
		}
		
		if(flag == true) {
			System.out.println("prime");
		} 
	}
 
}
