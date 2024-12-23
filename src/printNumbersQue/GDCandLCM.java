package printNumbersQue;

import java.util.Scanner;

public class GDCandLCM {

	public static void main(String[] args) {
		printLCMandGDC();

	}
	public static void printLCMandGDC() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Number : ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int on1 = n1;
		int on2 = n2;
		
		//GDC - greatest common integer : 
		//LCM - least common integer :
		
		while(n1%n2!=0) { 
			int rem = n1%n2;
			n1 = n2;
			n2 = rem;
			
		}
		int gdc = n2;
		int lcm = on1*on2/gdc;
		System.out.println("GDC of "+on1+" and "+on2+" is "+gdc);
		System.out.println("LCM of  "+on1+" and "+on2+" is "+lcm);
		
	}

}
