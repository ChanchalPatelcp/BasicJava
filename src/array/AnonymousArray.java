package array;
// Array without Name or single time use
public class AnonymousArray {

	public static void main(String[] args) {
		print(new int[] {2,3,6,5,4});

	}
	public static void print(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
	}
	

}
