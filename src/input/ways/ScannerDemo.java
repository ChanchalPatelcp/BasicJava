package input.ways;
import java.util.Scanner;
public class ScannerDemo {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter the information : ");
		 int num = scan.nextInt();
		 String name = scan.nextLine();
		 String name1 = scan.nextLine();
		 float num1 = scan.nextFloat();
		 double num2 = scan.nextDouble();
		 short s = scan.nextShort();
		 boolean flag = scan.hasNext();
		 
		 System.out.println(num+" "+name1+" "+num1+" "+num2+" "+s+" "+flag);
		 
		 
	}

}
