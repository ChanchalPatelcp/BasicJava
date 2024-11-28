package array;

public class Sorting {

	public static void main(String[] args) {
		int[] arr = { 2, 4, 11, 8, 1, 9,23 , 45, 0, 7, 3, 6,2,4,11 };

		System.out.println("Accending Order : ");
		accending(arr);
		System.out.println("\nDeccending order : ");
		deccending(arr);
	}

	public static void accending(int arr[]) {// 2 4 8 1 9 11
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i+1; j < arr.length ; j++) {
				if (arr[i] > arr[j]) {
					int num = 0;
					num = arr[i];
					arr[i] = arr[j];
					arr[j] = num;
				}
				
			}
		}
		display(arr);

	}        

	public static void deccending(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j =i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int num;
					num = arr[i];
					arr[i] = arr[j];
					arr[j]= num;
					
					
				}
			}
		}
		display(arr);

	}

	public static void display(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
