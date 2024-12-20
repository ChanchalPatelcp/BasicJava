package onlineLearn;

class Oops {
	String name;
	int age;
	String fatherName;

	// by using this
	public void print() {
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.fatherName);
	}

 public static void main(String[]args) {
	 Oops s1 = new Oops();
	 s1.name = "Chanchal";
	 s1.age = 20;
	 s1.fatherName = "Mr. Bhagwat Patel";
	 
	 s1.print();
	
	 
 }
	// without this
//	public void getData(String name1, int age1, String fatherName1) {
//		name = name1;
//		age = age1;
//		fatherName = fatherName1;
//
//	}
//
//	void print() {
//		System.out.println(name + "\n" + age + "\n" + fatherName);
//	}
//
//	public static void main(String[] args) {
//		Oops s1 = new Oops();
//		s1.getData("Chanchal", 20, "Bhagwat Patel");
//		s1.print();
//	}

}
