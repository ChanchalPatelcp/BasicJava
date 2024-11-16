package array;

public class DoubleArray {

	public static void main(String[] args) {
		//Declaration & initialization
		int size = 3;
		 int num[][] = new int[size][size];
		int[][] num1 = {{6,7,8},{6,7,8}} ;
		// assign value
		num[1][1] = 5;
		// access value
		System.out.println(num[1][1]);
		System.out.println(num1[0][2]);
		
		String S[][] = new String[3][4];
		S[2][3] = "Chanchal";
		
		System.out.println(S[2][3]);
		System.out.println(S[1][2]);
		
		boolean B[][] = new boolean[3][5];
		
		B[0][4] = true;
		System.out.println(B[0][4]);
		System.out.println(B[1][3]);
		
		//length of array
		System.out.println("Row = "+B.length);
		System.out.println("Column = "+B[0].length);
		
		System.out.println(B[1]);
		
	}

}
