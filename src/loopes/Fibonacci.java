package loopes;
import java.util.Scanner;
public class Fibonacci {
	
	
	// 0 1 1 2 3 5 8 13 21 34

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int prev = scan.nextInt();
		if(prev==1) {
			System.out.println(0);
		}
		else if(prev==2) {
			System.out.print(0+" "+1+" ");
		}else {
			int p=0;
			int q=1;
			System.out.print(p+" "+q+" ");
			for(int i=3;i<=prev;i++) {
				double sum = p+q;
				System.out.print(sum+" ");
				p=q;
				q=(int)sum;
			}
			
		}
	}
		

	

}
