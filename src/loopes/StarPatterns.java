package loopes;

public class StarPatterns {
	public static void main(String [] args) {
		StarPatterns patterns = new StarPatterns();
		patterns.square(7);
		
		
	}
	public void square(int num) {
		for(int i = 1;i<=num;i++) {
			for(int j = 1;j<=num;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
	}

}

 