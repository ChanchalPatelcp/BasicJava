package loopes;
import java.util.Scanner;
public class While {
	public static void main(String [] args) {
		
		// loops : while , do while , for , for each
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the num : ");
			int num = sc.nextInt();
	
		while(num>=1 && num <=10) {
			System.out.println(num);
			num++;
		
		}
		 do {
			 System.out.println(num);
			 num+=5;
			 
		 }while(num>=1 && num<=20);
		 
		 for( num = 10 ;num <=100;num+=10) {
			 System.out.println(num);
			 
		 }
		 
	
	}

}
