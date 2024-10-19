package type.casting;
 // Explicit typecasting convert higher datatype to lower datatype
// it is also known as upcasting or narrowing
public class Explicit {
	public static void main (String args[]) {
		byte b = 65; // range = -128 to 127 , 1bit
		
		short s = 30000;// -32768 to 32767, 2bit
		char c = 'a';//0to255, 2bit
		int i = 325678999;// 4bit
		float f = 348000.6f;// 4bit
		long l = 3456776;//8bit
		double d= 2345678900.6;//8bit
		
		b = (byte)d;
		s =(short) f;
		c = (char)i; 
		
		System.out.println(b+" "+s+" "+c);
	}

}
