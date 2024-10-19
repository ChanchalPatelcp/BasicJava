package loopes;
import java.util.Scanner;
public class SumOfNaturalNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N ;
		int sum = 0;
		N = sc.nextInt();
		
		for(int i=1; i<=N;i++) {
			sum = sum + i;
			 
		}
		System.out.println("Sum of "+N+" natural number : "+sum);

	}

}
