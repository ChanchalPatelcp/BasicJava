package test;

import java.util.Scanner;

/*
 
 	1> input : empName, empCity, designation
 			designation : 1)Dev 2) designer 3) QA 4)arch 5)TeamLeader 6) Manager
 	2> salary = 25000;(dev)// method
 	3> output : empName, empCity, designation, salary
 	4> repeat step 1 - 3
 
 */

public class Employee {
	public static void main(String[] args) {
		getData();
	 

	}

	public static void getData() {

		Scanner sc = new Scanner(System.in);
		int choice = 1;
		do {
			String empName = sc.next();
			String empCity = sc.next();
			System.out.println(
					"Choose Designation :\n 1) Developer\n 2) Designer\n 3)QA\n 4)architechture\n 5)TeamLeader\n 6)Manager");
			int designation = sc.nextInt();

			System.out.println("Employee Name : " + empName);
			System.out.println("Employee City: " + empCity);

			System.out.println(getSalary(designation));
			
			System.out.println("Enter another detail of Employee press 1");
			choice = sc.nextInt();

		} while (choice == 1);

	}

	private static String getSalary(int designation) {
		
		switch (designation) {
		case 1:
			return "Designation - Developer\nSalary - 25000";
		case 2:
			return "Designation -Designer\nSalary - 30000";
		case 3:
			return "Designation - QA\nSalary - 40000";
		case 4:
			return "Designation - Architecture\nSalary - 45000";
		case 5:
			return "Designation - TeamLeader\nSalary - 50000";
		case 6:
			return "Designation - Manager\nSalary-60000";
		default :
				return "Wrong Designation";

	}
		
	}

}
