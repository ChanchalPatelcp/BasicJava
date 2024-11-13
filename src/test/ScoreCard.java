package test;

import java.util.Scanner;

/*
 
 	1) input - student name, five subjects number
 	
 	2) average 87
 	
 	3) grade =  grade(average); (int)average/10
 	
 	4)print name, average, grade
 
 	5) if 1 take user choice for another student if 0 then exit the code
 	
 	6) if user press 1 then repeat step 1 - 5
 
 */

public class ScoreCard {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		do{
			System.out.println("Enter Student name : ");
			String studentName = sc.next();
			
			System.out.println("Enter the marks of -  Maths : Physics :  Chemistry : Hindi : English : ");
			double maths = sc.nextDouble();
			double physics = sc.nextDouble();
			double chemistry = sc.nextDouble();
			double hindi = sc.nextDouble();
			double english = sc.nextDouble();

			double average = (maths + physics + chemistry + hindi + english) / 5;
			System.out.println(studentName);
			System.out.println("Average : " + average);
			
			char res = getGrade(average);
			System.out.println("Grade : "+res);
			System.out.println( getGrade(average) );
			
			System.out.println("if you want to make marksheet of another student then press 1 ");
			choice = sc.nextInt();
		}while(choice==1);
		
		System.out.println("End!");
	}
	
	public static char getGrade(double average) {
		int grade = (int) average / 10;
		switch (grade) {

		case 9:
			return 'A';
		case 8:
			return 'B';
		case 7:
			return 'C';
		case 6:
			return 'D';
		case 5:
			return 'E';
		default:
			return 'F';
		}
	}

}
