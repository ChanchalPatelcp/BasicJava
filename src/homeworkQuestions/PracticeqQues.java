package homeworkQuestions;

import java.util.Scanner;

public class PracticeqQues {

	public static void main(String[] args) {
		smaller();
		
	}

	public static void smaller() {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[6];
		System.out.print("Enter Elements : ");
		for (int i = 0; i < 6; i++) {
			arr[i] = sc.nextInt();
		}

		int ssmall = 0;
		int small=0 ;
		int num=0;;
		for (int i = 0; i < 6; i++) {
			for (int j = i + 1; j < 6; j++) {
				if (arr[i] > arr[j]) {
					small = arr[j];
					ssmall =num;
				}
				
			}
			num = small;
		}
		System.out.println(small); 
		
		System.out.println("Second small number : " + ssmall);

	}
	
	

}
