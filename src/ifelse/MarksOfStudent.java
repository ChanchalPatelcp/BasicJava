package ifelse;

import java.util.Scanner;

public class MarksOfStudent {

	public static void main(String[] args) {
		marks();

	}

	public static void marks() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Marks Of Student : ");
		int marks = sc.nextInt();// take marks input

		if (marks > 90) {
			System.out.println("Excellent.");
		} else if (marks > 80 && marks <= 90) {
			System.out.println("Good.");

		} else if (marks > 70 && marks <= 80) {
			System.out.println("fair.");

		} else if (marks > 60 && marks <= 70) {
			System.out.println("meets exceptions.");
		} else if (marks < 60) {
			System.out.println("below par.");
		}
	}

}
