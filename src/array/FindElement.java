package array;

import java.util.Scanner;

public class FindElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter Elements : ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the number to find : ");
		int num = sc.nextInt();
		int i;
		for( i=0;i<size;i++) {
			if(num==arr[i]) {
				System.out.println(i);
				if(i+1==size) {
					i+=2;
				}
				break;
			}
		}
		
		if(i==size) {
			System.out.println("Number is not Found ");
		}
		
	}

}
