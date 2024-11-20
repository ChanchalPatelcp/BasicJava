package array;

import java.util.Scanner;

public class MinAndMax {

	public static void main(String[] args) {
		minAndMax();

	}
	public static void minAndMax() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size : ");
		int size = sc.nextInt();
		
		System.out.println("Enter elements : ");
		int num[] = new int[size];
		for(int i=0;i<size;i++) {
			num[i] = sc.nextInt();
		}
		
		//assign two variable with 1st value array element
		int min = num[0];
		int max = num[0];
		
		//iterate all values of array
		for(int i =1;i<size;i++) {
			if(min>num[i]) { // compare min value with num[i]
				min = num[i];// assign the value 
				
			} 
			if(max<num[i]) {
				max = num[i];
			}
		}
		System.out.println("min value = "+min);
		System.out.println("max value = "+max);
		
		
	}

}
