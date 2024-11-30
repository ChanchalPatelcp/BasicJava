package array;

public class Student {
	private String name;
	private int age;
	private String Class;
	
	void getData(int age1,String name1,String Class1) {
		name = name1;
		age = age1;
		Class = Class1;
	}
	void printData() {
		System.out.print(name+"\n"+age+"\n"+Class);
	}

}
