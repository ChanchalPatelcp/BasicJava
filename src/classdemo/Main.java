package classdemo;

public class Main {

	public static void main(String[] args) {
		Employee obj = new Employee();
		obj.getData(24, "chanchal", "bhopal", "chanchal123");
		System.out.println(obj.age);
		System.out.println(obj.City);
		System.out.println(obj.name);
		System.out.println(obj.id);
		
		Employee obj2 = new Employee();
		obj2.getData(25, "chanchal1", "delhi", "chanchal123456");
		System.out.println(obj2.age);
		System.out.println(obj2.City);
		System.out.println(obj2.name);
		System.out.println(obj2.id);
		
	}

}
