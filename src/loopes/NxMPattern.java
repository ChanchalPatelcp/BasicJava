package loopes;

public class NxMPattern {

	public static void main(String[] args) {
		star(4,7);
		method1(5,4);

	}
	public static void star(int row,int column) {
		/*
		  ****
		  ****
		  ****
		  **** nxm
		 */
		int i,j;
		for(i=1;i<=row;i++) {
			for(j=1;j<=column;j++)
				System.out.print('*');
			System.out.println();
		}
	}
	public static void method1(int num1,int num2) {
		/*
		 1  2  3  4  
		 5  6  7  8
		 9  10 11 12
		 13 14 15 16 
		 17 18 19 20
		 
		 */
		int k = 1;
		for(int i=1;i<=num1;i++) {
			for(int j = 1;j<=num2;j++) {
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
		/*
		 20 19 18 17 
		 16 15 14 13
		 12 11 10 9 
		 8  7  6  5
		 4  3  2  1
		 
		 ( dry run of code :
		       j=1  j=2  j=3  j=4
		 i=1 : 20    19   18   17
		 i=2 : 16    15   14   13
		 i=3 : 12    11   10   9
		 i=4 :  8     7    6   5
		 i=5 :  4     3    2   1 )
		 */
		int l =20;
		for(int i=1;i<=num1;i++) {
			for(int j =1;j<=num2;j++) {
				System.out.print(l+" ");
				l--;
			} 
			System.out.println();
			
		}
	}

}
