package loopes;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		prime();

	}
	public static void prime() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		double num = sc.nextDouble();
	    int count = 0;
		for(int i=2;i*i<num;i++) {
			if(num%i==0) {
				count++;
				break;
			}
		}
		if(count==0) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("not a Prime");
		}
		
		
	}

}
