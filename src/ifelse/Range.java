package ifelse;

import java.util.Scanner;

public class Range {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int Number = sc.nextInt();
		
		if (Number %2==0) {
			if(Number>=0 && Number<=50) {
				System.out.println("Number is Even and also between 0 to 50.");
			}
			else if(Number>=51 && Number<=100) {
				System.out.println("Number is Even and lie between 51 to 100.");
			}else if(Number>=101 && Number<=1000) {
				System.out.println("Number is Even and lie between 101 to 1000.");
			}else if(Number>=1001 && Number<=10000) {
				System.out.println("Number is Even and lie between 1001 to 10000.");
			}
			else {
				System.out.println("number is less than 0 either greater than 100 ");
			}
			
		}else {
			System.out.println("Number is odd.");
			
		}
		
	}

}
