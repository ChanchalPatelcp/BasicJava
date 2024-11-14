package array;

public class Array1 {

	public static void main(String[] args) {
	
		
		//Declaration : data_type [] variable_name;
		int num[];
		int []num4;
		int[] num3 ;
		
		//initialization: data_type [] Variable_name = new data_type[size];
		num = new int[6];
		int []num1 = {7,8,89,87,67,65};
		int[] num2= new int[10];
		
		
		num[0]=7;
		System.out.println(num1[1]);
		
		//size of array: variable_name.length
		int len = num1.length;
		System.out.println(len);
		
		System.out.println(num2.length);

	}

}
