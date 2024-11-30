package homeworkQuestions;

import java.util.Scanner;

public class PracticeqQues {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		//smaller();
		highest();

	}

	public static void smaller() {
		
		int[] arr = new int[6];
		System.out.print("Enter Elements : ");
		for (int i = 0; i < 6; i++) {
			arr[i] = sc.nextInt();
		}

		int ssmall = 0;
		int small = arr[0];
		int num = 0;
		for (int i = 1; i < arr.length; i++) {// 3 4 5 2 7 1
			if (small > arr[i]) {
				ssmall = small;
				small = arr[i];

			}
		}

		System.out.println("Second smallest number : " + ssmall);

	}
	public static void highest() {
		System.out.print("Enter Size of a matrix : ");
		int Size = sc.nextInt();
		System.out.println("Enter Elements : ");
		int arr[] = new int[Size];
		for(int i=0;i<Size;i++) {
			arr[i] = sc.nextInt();
		}
		
		int highest = arr[0];
		int SecondHighest = 0;
		
		for(int i=1;i<Size;i++) {// 2 6 5 7 9 6
			if(highest<arr[i]) {
				SecondHighest = highest;
				highest = arr[i];
				
				
			}
			
		}
		System.out.println(+SecondHighest);
		
	}

}
