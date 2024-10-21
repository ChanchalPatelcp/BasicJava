package vehicles;



public class Vehicle {
	String modelName;
	int modelYear;
	String companyName;
	int highestSpeed;
	
	public void setData( String model1,int modelyear,String company1,int highestspeed) {
		modelName = model1;
		modelYear = modelyear;
		companyName = company1;
		highestSpeed = highestspeed;
	}
	public void display() {
		System.out.println("modelName: "+ modelName);
		System.out.println("modelYear : "+ modelYear);
		System.out.println("companyName :"+companyName);
		System.out.println("highestSpeed :"+highestSpeed);
	}
	public static void main() {
		Vehicle car = new Vehicle();
		car.setData("BMW8 ",2001, "Audi",4577);
		car.display();
		
		System.out.println( );
		
		
	}

}
