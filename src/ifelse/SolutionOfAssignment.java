package ifelse;

import java.util.Scanner;

public class SolutionOfAssignment {

	public static void main(String[] args) {
		SolutionOfAssignment SA = new SolutionOfAssignment();
//		SA.comparision();
		SA.powerDemo();
	}
	public void comparision() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		if(num1<num2 && num2<num3) {
			System.out.println(num1+" is smallest");
		}else if(num2<num1 && num2<num3) {
			System.out.println(num2+" is smallest");
		}else if(num3<num1 && num3<num2) {
			System.out.println(num3+" is smallest");
		}
	}
	public void powerDemo() {
	
		        Scanner sc = new Scanner(System.in);
		     
		        int base;
		        int power;
		        int result = 1;
		        
		        System.out.print("Enter the base number : ");
		        base = sc.nextInt();
		        
		        System.out.print("Enter the power : ");
		        power = sc.nextInt();

		        for(int i = 1; i <= power; i++)
		        {
			    result *= base;
		        }

		        System.out.println("Result: "+ result);
		       
		       
		    }
		
	
	


}
