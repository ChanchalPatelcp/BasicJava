package ifelse;

import java.util.Scanner;

public class Devide3 {
	public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	
	if(num%3==0) {
		System.out.println("num is divisible by 3");
	}else {
		System.out.println("end");
	}
	
	}
}

