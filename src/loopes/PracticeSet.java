package loopes;

public class PracticeSet {

	public static void main(String[] args) {
		PracticeSet ps = new PracticeSet();
		ps.question1(5);

	}
	public void question1(int a) {
		for(int i=a;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print('*');
				
			}
			System.out.println();
			

		}
	}

}
