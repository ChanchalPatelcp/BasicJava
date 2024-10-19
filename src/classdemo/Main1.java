package classdemo;

public class Main1 {

	public static void main(String[] args) {
		Studentdata obj = new Studentdata();
		Studentdata obj1 = new Studentdata();
		
		obj.getname("Chanchal");
		obj.getclass("12th");
		obj.getphysics(82);
		obj.getchemistry(56);
		obj.getmaths(98);
		obj.gettotal(82+56+98);
		
		System.out.println(" Data of Student 1 : ");
		System.out.println("Name : "+obj.Name);
		System.out.println("Class : "+obj.Class);
		System.out.println("Physics Marks: "+obj.physics);
		System.out.println("Chemistry Marks : "+obj.chemistry);
		System.out.println("Maths Marks : "+obj.maths);
		System.out.println("Total marks : "+obj.totalmarks);
		
		obj1.getname("Nisha");
		obj1.getclass("11th");
		obj1.getphysics(83);
		obj1.getchemistry(67);
		obj1.getmaths(71);
		obj1.gettotal(83+67+71);
		
		System.out.println("  ");
		System.out.println(" Data of Student 2 : ");
		System.out.println("Name : "+obj1.Name);
		System.out.println("Class : "+obj1.Class);
		System.out.println("Physics Marks: "+obj1.physics);
		System.out.println("Chemistry Marks : "+obj1.chemistry);
		System.out.println("Maths Marks : "+obj1.maths);
		System.out.println("Total marks : "+obj1.totalmarks);
			
		
		

	}

}
