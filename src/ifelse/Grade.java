package ifelse;

import java.util.Scanner;

public class Grade {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks : ");
		int marks = sc.nextInt();
		
		if(marks<= 100 &&marks >= 70) {
			System.out.println("Result : pass \n Grade : A");
		}
		else if(marks >=50) {
			System.out.println("Result : pass \n Grade : B");
			
		}
		else if(marks >= 32) {
			System.out.println("Result : pass \n Grade : C");
		}
		else  {
			System.out.println("Result : Fail");
		}
	}

}
