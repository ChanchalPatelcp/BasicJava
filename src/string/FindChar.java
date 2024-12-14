package string;

public class FindChar {

	public static void main(String[] args) {
		String str = "Chanchal patel";
		char ch ='p';
		for(int i =0;i<str.length();i++) {
			if(str.charAt(i)==ch) {
				System.out.print(i);
				break;
			}
		}

	}

}
