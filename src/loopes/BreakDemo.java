package loopes;

public class BreakDemo {

	public static void main(String[] args) {
		outerLoop:
		for (int j = 2; j <= 10; j++) {
			
			System.out.println("welcome"+ j);
			for (int i = 1; i <= 10; i++) {
				
				
				if(j%2!=0) {
					continue outerLoop;
				}
				System.out.print( "j: "+j+" i: "+i + " ");
				
			}
			System.out.println("java");
		
		}

	}

}
