package array;

import java.util.Scanner;

public class Daigonal {

	public static void main(String[] args) {
		daigonalElement(); 

	}
	public static void daigonalElement() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of a Matrix : ");
		int Size = sc.nextInt();
		int arr[][] = new int[Size][Size];
		System.out.println("Enter Elements : ");
		
		for(int i =0;i<Size;i++) {
			for(int j =0;j<Size;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.print("Daigonal Elements are : ");
		for(int i=0;i<Size;i++) {
			for(int j =0;j<Size;j++) {
				if(i==j) {
				System.out.print(arr[i][j]+",");
				}
			}
		}
		
		
		
		
	}

}
