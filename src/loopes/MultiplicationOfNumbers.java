package loopes;

public class MultiplicationOfNumbers {

	public static void main(String[] args) {
		int m = 3;
		int i = 1;
		int multiplication = 1;
		while(i<=m) {
			multiplication = multiplication * i;
			 i++;
			
		}
		System.out.println("multiplication of "+m+"natural numbers : "+multiplication);

	}

}
