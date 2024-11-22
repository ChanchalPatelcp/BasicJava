package array;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multiplication();

	}
	
	public static void multiplication(){
		
		int size = 3;
		int size1 = 2; 
		
		int arr[][] = new int[2][3];
		int arr1[][] = new int[3][4];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Element of Matrix 1 : ");
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				arr[i][j] = sc.nextInt();
			}
			
		}
		System.out.println("Enter the Elements of Matrix 2 : ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				arr1[i][j] = sc.nextInt();
			}
			
		}
		
		for(int i = 0; i<2;i++){
			for(int j= 0 ; j< 4; j++) {
				int temp =0;
				for(int k = 0; k<3;k++) {
					
					temp+= arr[i][k]*arr1[k][j];
				}
				System.out.println(temp);
			}
		}
}
//	3 2 3 5 3 2
//	Enter the Elements of Matrix 2 : 
//	2 6 4 3 6  3 6 3 7 2 7 2

}
