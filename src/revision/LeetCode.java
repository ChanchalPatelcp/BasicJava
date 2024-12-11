package revision;

import java.util.Scanner;

public class LeetCode {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
//		getData();
//		sortingList();
		deleteDuplicate();

	}

	public static void getData() {

		int[] list1 = new int[3];
		int[] list2 = new int[3];

		System.out.print("Enter List1 : ");
		for (int i = 0; i < 3; i++) {
			list1[i] = sc.nextInt();
		}
		System.out.print("Enter List2 : ");
		for (int i = 0; i < 3; i++) {
			list2[i] = sc.nextInt();
		}

	}

	public static void sortingList() {
		int[] list1 = new int[3];
		int[] list2 = new int[3];
		int k = 0;

		for (int i = 1; i < 3; i++) {
			if (list1[i] > list1[i - 1]) {
				list1[k] = list1[i - 1];
				k++;
			}

		}
		System.out.println(list1[k]);

	}
	public static void deleteDuplicate() {
		int[] list = {1,1,2,2,3,6,5,3,6,5};
		int k =1;
		for(int i =1;i<list.length;i++) {
			if(list[i]!=list[i-1]) {
				list[k] = list[i];
				k++;
			}
			
	    }
		System.out.println(list[k]);
	
		
			
	}

}
