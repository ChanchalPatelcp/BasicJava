package array;

public class SpanOfArray {

	public static void main(String[] args) {
		findmaxmin();

	}
	public static void findmaxmin() {
		int[] arr = {87,56,89,76,32};
		int max= arr[0] ;
		int min = arr[0];
		
		for(int i =1;i<arr.length;i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
			if(min>arr[i]) {
				min = arr[i];
			}
			
		}
		int span = max - min ;
		System.out.println(span);
	
		
	}

}
