package loopes;

public class StarPatternSquare {
	public static void main(String [] args) {
		StarPatternSquare patterns = new StarPatternSquare();
		patterns.star(5);
		patterns.method1(4);
		patterns.method2(5);
		patterns.method3(6);
		
	}
	public void star(int num) {
		for(int i = 1;i<=num;i++) {
			for(int j = 1;j<=num;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i = 1 ;i<=num ; i++) {
			for(int j = 1;j<=num;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
		
	public void method1(int num) {
		/*
		 12345
		 54321
		 12345
		 54321
		 12345
	    */
		for(int i = 1 ;i<=num ; i++) {
			if(i%2!=0) {
	        for(int j = 1;j<=num;j++)
				System.out.print(j+" ");
	        	System.out.println();
			}else{
				 for(int j = num;j>=1;j--)
				     System.out.print(j+" ");
				 	 System.out.println();
			} 	
		}	
	}
	public void method2(int num) {
		/*
		 00000
		 11111
		 00000
		 11111
		 00000
		 */
		// by 3 loop
		for(int i = 1; i<=num;i++) {
			if(i%2!=0) {
				for(int j=1;j<=num;j++) 
				System.out.print(0);
				System.out.println();
			}else {
				for(int j=1;j<=num;j++)
				System.out.print(1);
				System.out.println();
			}
		}
	// by 2 loop
		for(int i = 1;i<=num;i++) {
			for(int j =1;j<=num;j++) {
				if(i%2!=0) {
					System.out.print(0);
				}else {
					System.out.print(1);
				}
				
			}
			System.out.println();
		}
	}
	public void method3(int num) {
		/*
		 11111
		 22222
		 33333
		 44444
		 55555
		 */
		for(int i=1;i<=num;i++) {
			for(int j = 1;j<=num;j++)
				System.out.print(i);
				System.out.println();
			
		}
		
		
		
	}

		
	

}

 