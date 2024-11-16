package array;

import java.util.Scanner;

public class ThreeDimention {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[][][] = new int[3][2][2];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
				for(int k=0;k<2;k++) {
					arr[i][j][k] = sc.nextInt();
				}
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
				for(int k=0;k<2;k++) {
					System.out.print( arr[i][j][k]+",");
				}
			}
		}
		
	}

}
