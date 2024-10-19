package ifelse;

import java.util.Scanner;

public class Module5 {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int Number = sc.nextInt();
		
		if(Number%2==0) {
			if(Number%5==0) {
				System.out.println(Number+" : Number is even and also divisible by 5. ");
				
			}else {
				System.out.println(Number+" : Number is even but not divisible by 5.");
			}
			
		}else {
			System.out.println("Number is odd.");
		}
		
	}

}
