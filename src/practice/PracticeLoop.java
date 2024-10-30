package practice;

public class PracticeLoop {

	public static void main(String[] args) {
//	star(5);
//    star2(5);
    number(4,5);

	}
	public static void star(int a) {
		/*
		 *****
		 *****
		 *****
		 *****
		 *****
		 
		 */
		for(int i=1;i<=a;i++) {
			for(int j =1;j<=a;j++) {
				System.out.print('*');
			}
		System.out.println();
		}
		for(int i=1;i<=a;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print('*');
				
			}
			System.out.println();
		}
		/*
		 - - - - *
		 - - - * *
		 - - * * *
		 - * * * *
		 * * * * *
		     j=1  j=2  j=3  j=4  j=5
		 i=1  -    -    -    -    *
		 i=2  -    -    -    *
		 i=3
		 i=4
		 i=5
		 
		 */
		
		for(int i = 1;i<=a;i++) {
			
			for(int j=a;j>=1;j--) {
				if(j>i) {
					System.out.print(" ");
					
					
				}else {
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
		
	}
	public static void star2(int a) {
		/*
		 *****
		 ****
		 ***
		 **
		 *
		     j=1  2  3  4  5
		 i=1  *   *  *   *  *
		   2      *   *   *  *
		   3
		   4
		   5
	    */
		for(int i = 1;i<=a;i++) {
			int k =1;
			for(int j=1;j<=a;j++) {
				if(k>=i) {
					System.out.print('*');
				}else {
					System.out.print(' ');
				}
				k++;
			}
			System.out.println();
		}
		int k=1;
		for(int i=1;i<=a;i++) {
		
			for(int j=1;j<=i;j++) {
				System.out.print(k);
				k++;
			}
			System.out.println();
		}
		/*
		 1
		 0 1
		 1 0 1
		 0 1 0 1
		 1 0 1 0 1
		 */
		int l=1;
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=i;j++) {
				if(l%2==0) {
					System.out.print(0);
				}else {
					System.out.print(1);
				}
				l++;
				
			}
			System.out.println();
		}
		for(int i=1;i<=a;i++) {
			if(i%2==0) {
				for(int j=5;j>=1;j--) {
					System.out.print(j);
					
				}
			}else {
				for(int j=1;j<=a;j++) {
					System.out.print(j);
				
				}
			}
			System.out.println();
			
		
		}
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=a;j++) {
				if(i%2==0) {
					System.out.print(1);
				}else {
					System.out.print(0);
				}
				
			}
			System.out.println();
		}
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=a;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
			
	}
	public static void number(int a,int b) {
		int g =20;
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=b;j++) {
				System.out.print(g);
				g--;
				
			}
			System.out.println();
		}
	}

}
