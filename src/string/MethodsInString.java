package string;

public class MethodsInString {

	public static void main(String[] args) {
//		findChar();
//		equals();
//		concat();
		trim();
	}

	public static void findChar() {
		String str = "Chanchal patel";
		char ch = 'p';
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				System.out.print(i);
				break;
			}
		}
	}

	public static void equals() {
		String str = "Chanchal";
		String str1 = "Chanchal";
		
		if (str.length() != str1.length()) {
			System.out.println("false");
		}
		else{
			for( int i=0;i<str.length();i++) {
				if(str.charAt(i)==str1.charAt(i)) {
					if(i==str.length()-1) {
						System.out.println("true");
					}
					
				}
				else {
					System.out.println("false");
					break;
				}
			}
		}
			

	}
	public static void concat() {
		String str = "Chanchal";
		String str1 ="Patel";
		
		System.out.println(str+str1);
	}
	public static void trim() {
		String s = "  chan";
		System.out.println(s.charAt(1));
		
//		for(int i=0;i<s.length();i++) {
//			
//		}
	}

}
