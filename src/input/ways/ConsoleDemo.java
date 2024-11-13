package input.ways;
import java.io.Console;
public class ConsoleDemo {
//console class is used for take user input its mainly used for security purpose or get password input
// its have two methods 1) readLine : return string line 
//	                        2) readPassword : return array of character
	
	public static void main(String[] args) {
		practice(2);
		
//		Console cs = System.console();
//		
//		System.out.println("Enter name :");
//		String name = cs.readLine();
//		System.out.println("Enter Password : ");
//		
//		char[] password = cs.readPassword();
//		
//		System.out.println("Name = "+name);
//		System.out.println("Password = "+password);
//		System.out.println(String.valueOf(password));
	
	}
	public static void practice(int a) {
		Console cl =System.console();
		String s = cl.readLine();
		char[] c = cl.readPassword();
		
		System.out.println(s + "  "+c);
	}
	
	
	


}

