package loopes;

public class StarPatternTriangle {

	public static void main(String[] args) {
		
//		star(6);
//		System.out.println(" -----------------------------------------------------------------------------");
//		star2(4);
//		star3(5);
		star4(5);
	}
	public static void star(int a) {
		/*
		 
		 *
		 **
		 ***
		 ****
		 *****
		 
		 */
		
		for(int i = 1;i<=a;i++) {
		 for( int j=i;j>=1;j--) 
			 System.out.print('*');
		 System.out.println();
		}
	}
	public static void star2(int b) {
		/*
		 
		 *****
		 ****
		 ***
		 **
		 *
		 
		 */
		
		for(int i = 1;i<=b;i++) {
			for(int j =b;j>=i;j--) {
				System.out.print('*'+" ");
				
			}
			System.out.println();
		}
	}
	public static void star3(int a) {
		/*
		 - - - - *
		 - - - * *
		 - - * * *
		 - * * * *
		 * * * * *
		 
		 - - - -*
		 - - - * 
		 
		 
		 
		 */
		for(int i = 1;i<=a;i++) {
			for(int j=a;j>=1;j--) {
				if(j>i) {
					System.out.print(" ");
				}else {
					System.out.print('*');
				
				}
				
				
			}
			System.out.println();
			
		}
		
	}
	public static void star4(int a) {
		/*
		 
		 * * * * *
		 - * * * *
		 - - * * *
		 - - - * *
		 - - - - *
		 
		 */
		for(int i =1;i<=a;i++) {
			for(int j = 1;j<=a;j++) {
				if(j>=i) {
				    System.out.print('*');
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	
	
	
	
	

}
