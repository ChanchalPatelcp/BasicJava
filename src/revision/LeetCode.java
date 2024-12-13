package revision;

import java.util.Scanner;

public class LeetCode {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		plusOne();
		deleteDuplicate();

	}

	public static void deleteDuplicate() {
		int[] list = { 1, 1, 2, 2, 3, 3, 4, 4, 5 };
		int k = 1;
		for (int i = 1; i < list.length; i++) {
			if (list[i] != list[i - 1]) {
				list[k] = list[i];
				k++;
			}

		}
		System.out.println(k);

	}
	public static void plusOne() {
		System.out.println("Enter size :");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter Elements : ");
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		int[] newDigit = new int[size];
		for(int i=0;i<size;i++) {
			if(i==size-1) {
				arr[i] += 1;
			}
			newDigit[i] = arr[i];
		}
		for(int i =0;i<size;i++) {
		System.out.print(newDigit[i]+",");
	}
	}
	public static void mergeArray() {
		int[] arr1 = {1,2,3};
		int[] arr2 = {2,4,5};
		
		int c1=0;
		int c2 =0;
		int k=0;
		int[] res = new int[6];
		
		while(true) {
			if(arr1[c1]<arr2[c2]) {
				res[k] = arr1[c1];
				c1++;
				k++;
			}
			else if(arr1[c1]>arr2[c2]) {
				res[k] = arr2[c2];
				c2++;
				k++;
			}
			
			
		}
		
		
		for( int j = 0;j<6;j++) {
			
		
		System.out.println(res[j]);
		}
		
	}
	

}
