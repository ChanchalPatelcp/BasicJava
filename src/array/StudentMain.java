package array;

public class StudentMain {

	public static void main(String[] args) {
		Student[] st = new Student[10];
		st[0] = new Student();
		st[0].getData(21, "chanchal", "12th"); 
		st[0].printData();
	}

}
