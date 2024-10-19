package type.casting;
 // implicit typecasting converting a lower datatype to higher data type
//it is also known as downcasting or widening
public class Implicit {
	public static void main(String args[]) {
		 
		boolean bol = true; // single data type , we cannot cast the datatype
		
		byte b = 65; // range = -128 to 127 , 1bit
	
		short s = 30000;// -32768 to 32767, 2bit
		char c = 'a';//0to255, 2bit
		int i = 325678999;// 4bit
		float f = 348000.6f;// 4bit
		long l = 3456776;//8bit
		double d= 2345678900.6;//8bit
		
		
		s = b;
		i=c;
		c=(char) b;
		d=f;
		
		System.out.println(s+" "+i+" "+d+" "+c);
		
				
		
	}

}
