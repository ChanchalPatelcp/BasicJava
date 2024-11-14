package array;

import java.util.Scanner;

public class UserInputAndOutput {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a size: ");
		 int size = sc.nextInt();
		int[] num = new int[size];
		
		System.out.println("Length = "+num.length);
		
		System.out.println("Enter numbers : ");
		for(int i =0;i<num.length;i++)
			num[i]=sc.nextInt();
		
		System.out.print("numbers = ");
		for(int i =0;i<num.length;i++)
			System.out.print(num[i]+" ");
		
		
		}

}
