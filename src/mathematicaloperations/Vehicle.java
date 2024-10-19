package mathematicaloperations;

public class Vehicle {
	
	 String modelName;
	 int modelYear;
	 String companyName;
	 int highestSpeed;
	 
	 public void setData(String modelName1, int modelYear1,String companyName1,int highestspeed1) {
		 modelName = modelName1;
		 modelYear = modelYear1;
		 companyName = companyName1;
		 highestSpeed = highestspeed1;
	 }
	 public void display() {
		 System.out.println("Model name :"+modelName);
		 System.out.println("Model year:"+modelYear);
		 System.out.println("companyName :"+companyName);
		 System.out.println("highestSpeed :"+highestSpeed);
	 }

}
