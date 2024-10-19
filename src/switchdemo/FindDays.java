package switchdemo;

import java.util.Scanner;

public class FindDays {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter month : ");
		int month = sc.nextInt();

		switch (month) {
		case 1, 3, 5, 7, 8, 10, 12:
			System.out.println("month ="+month + "Days =" + 31);
			break;
		case 2:
			System.out.println(month + "Days = " + 28);
			break;
		case 4, 6, 9, 11:
			System.out.println(month + "Days" + 30);
			break;
		default:
			System.out.println("Invalid month.");
		}
		// we can use arrow (->) instead of (:) so we dont need a break in every case
		switch (month) {
			case 1, 3, 5, 7, 8, 10, 12 -> System.out.println(month + "Days =" + 31);
			case 2 -> System.out.println(month + "Days = " + 28);
			case 4, 6, 9, 11 -> System.out.println(month + "Days" + 30);
			default -> System.out.println("Invalid month.");
		}

	}

}
