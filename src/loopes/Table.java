package loopes;

public class Table {
	public static void main(String [] args) {
		int i = 1;
		while ( i<=10) {
			System.out.print(2*i+" ");
			i++;
			
		}
		i = 1;
		do {
			System.out.print(3*i+" " );
			i++;
		}while(i<=10);
		System.out.println();
		
		for(i=10;i>=1;i--) {
			System.out.print(5*i+" ");
			
		}
	}
	

}
