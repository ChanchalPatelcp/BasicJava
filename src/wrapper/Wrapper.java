package wrapper;

public class Wrapper {

	public static void main(String[] args) {
		int a =2;
		Integer in = 2;
		System.out.println(a);
		System.out.println(in==a);
		
		System.out.println(in.toString().equals("2"));
		
		Boolean bool = true;
		Float f = 2.3f;
		Double d = 2.345;
		Long l = 2678L;
		Short s = 234;
		Character c = 'a';
		
		Boolean b = new Boolean(true);
		Short st = new Short((short) 23);
		
		System.out.println(b+" "+st  );
		
		
		// auto boxing : primitive data type to corresponding wrapper class 
		Integer num = a;
		Integer num1 = Integer.valueOf(a);
		
		//Un boxing : wrapper class to primitive
		Integer num2 = 56;
		int r = num2;
		int num3 = num2.valueOf(num2);
		
		r = num2.intValue();
		
		String str = "4345678";
		String str1 = "thhbnn";
		
		Integer strnum = Integer.parseInt(str);

		System.out.println(str+" "+strnum);
		

	}

}
