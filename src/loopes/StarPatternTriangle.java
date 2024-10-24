package loopes;

public class StarPatternTriangle {

	public static void main(String[] args) {
		
//		star(6);
//		System.out.println(" -----------------------------------------------------------------------------");
//		star2(4);
//		star3(5);
//		star4(5);
//		method1(5);
//		method2(5);
		method3(4);
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
	public static void method1(int a) {
		/*
		 1
		 12
		 123
		 1234
		 12345
		 
		 
		 
		 */
		int k=1;
		for(int i = 1;i<=a;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(k);
				k++;
			}
			System.out.println();
			
		}
	
	}
	public static void method2(int a) {
		/*
		 1
		 0 1
		 1 0 1
		 0 1 0 1
		 
		 */
		int k =1;
		for(int i =1;i<=a;i++) {
			
			for(int j=1;j<=i;j++) {
				
				if(k%2!=0) {
					System.out.print(1);
				}else {
					System.out.print(0);
				}
				k++;
				}
			System.out.println();
		}
		
	}
	public static void method3(int a) {
		/*
		 1
		 23
		 456
		 78910
	    */
		int k = 1;
		for(int i = 1;i<=a;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print(k);
				k++;
			}
			System.out.println();
		}
		
	}
	
	
	
	
	
	

}
