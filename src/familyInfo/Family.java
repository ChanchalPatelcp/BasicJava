package familyInfo;

public class Family {
	String name;
	String brotherName;
	String motherName;
	String fatherName;
	
	void getInfo(String name1,String brotherName1,String motherName1,String fatherName1){
		name = name1;
		brotherName = brotherName1;
		motherName = motherName1;
		fatherName =fatherName1;
		
	}
	void display() {
		System.out.println(name);
		System.out.println(brotherName);
		System.out.println(motherName);
		System.out.println(fatherName);
	}

}
