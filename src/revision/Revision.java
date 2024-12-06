package revision;

import java.util.Scanner;

public class Revision {

	public static void main(String[] args) {
		arr();	

	}
	public static void arr() {
		Scanner sc = new Scanner(System.in);
		String arr[] = new String[100];
		System.out.print("Enter a 10 word sentence : ");
		for(int i=0;i<10;i++) {
			arr[i] = sc.next();
		}
		
		System.out.println(arr[4]);
		
	}
}
