package string;

public class StringDemo {

	public static void main(String[] args) {

		char[] ch = { 'g', 'j', 'k' };
		String str = "gjk";
		String str2 = "gjn";
		String str1 = new String(ch);

//			str = "chanchal";

		// equals
		System.out.println(str2 == str);
		System.out.println(str2.equals(str));
		System.out.println(str2.equalsIgnoreCase(str1));

		// string concat
		String str3 = str + str2;
		String str4 = str1.concat(str);
		System.out.println(str3 + "\n" + str4);

		// indexing
		System.out.println(str2.charAt(2));
		// length
		System.out.println(str1.length());
		// trim method
		System.out.println(str2);
		System.out.println(str2.trim());
		// strip
		System.out.println(str2.strip());
		System.out.println(str2.stripLeading());//remove space from starting 
		System.out.println(str2.stripTrailing());//remove space in last

		// compare
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareToIgnoreCase("GJK"));

		// subString
		String name = "Chanchal Patel";
		String new1 = name.substring(5);
		System.out.println(new1);
		System.out.println(name.substring(2, 8));
		
		//index
		System.out.println(name.indexOf('a'));
		System.out.println(name.lastIndexOf('a'));
		//replace
		System.out.println(name.replace('a', '@'));
		System.out.println(name.replaceFirst("a", "@a"));
		System.out.println(name.replaceAll("c", "an"));
		//LowerCase
		System.out.println(name.toLowerCase());
		//uppercase
		System.out.println(name.toUpperCase());
		
		//stringFormate
		System.out.println(String.format("Hello %s I am in %dnd year Student", "Sir",2));
		
		
		

	}

}
