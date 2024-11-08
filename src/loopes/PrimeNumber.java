package loopes;

import java.util.Scanner;

public class PrimeNumber {
	
	 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int num = scan.nextInt();
		PrimeNumber pn = new PrimeNumber(); 		 
		
		
		
		System.out.print("isPrime : ");
		pn.isPrime(num);
		System.out.print("primeHalf : ");
		pn.primeHalf(num);
		System.out.print("primeSqrt : ");
		pn.primeSqrt(num);
		System.out.print("nPrime : ");
		pn.nPrime(num);
		
	}

	public void isPrime(int num) {

		// step 1 : take a another variable2 intilize 2
		// step 2 : divide a variable1 with new variable2
		// step 3 : if reminder is equals to zero then print not a prime number end the
		// program
		// step 4 : else increment variable2 and repeat step 2 - 4 until variable2 is
		// not equals to variable1
		// step 5 : print number is a prime if variable1 is equals to variable 2
		 
			int count = 2;
			while (count != num) {
				int num1 = num % count;
				if (num1 == 0) {
				System.out.println("Not a Prime Number");
					break;
				} else {
					count++;
				}
			}
			if (num == count) {
				System.out.println("Prime Number  ");
			}
	 

	}
	
	public void primeHalf(int num) {
		// step 1: initialize variable2 is always true
		// step 2 : initialize variable3 to 2
		// step 3 : divide variable3 from variable1
		// step 4 : if remainder is equal to zero then print not a prime number and
		// initialize variable2 false
		// step 5 : if remainder is not equal to zero then increment variable3
		// step 6 : repeat steps 3,4,5 until variable3 is smaller or equals to half of
		// variable1
		// steps 7 : if variable2 is true then print prime number

		boolean variable = true;
		int i = 2;
		while (i <= (num / 2)) {
			int num1 = num % i;
			if (num1 == 0) {
				System.out.println("Not a Prime Number");
				variable = false;
				break;
			} else {
				i++;
			}
		}
		if(variable==true) {
			System.out.println("Prime Number");
		}

	}

	

	public void primeSqrt(int num) {
		boolean flag = true;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				System.out.println("Not a prime number");
				flag = false;
				break;
			}
		}

		if (flag == true) {
			System.out.println("prime number");
		}
	}
	
	public void nPrime(int input) {
		

		for (int num = 2; num <= input; num++) {
			int count = 2;
			int num1;
			while (count < num) {
				num1 = num % count;
				if (num1 == 0) {
//				System.out.print("Not a prime number");
					break;
				}
				count++;

			}
			if (num == count) {
				System.out.print(num + " , ");
			}
			
		}
	}
	
}