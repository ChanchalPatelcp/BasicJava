package array;

public class TwoSum {

	public static void main(String[] args) {
		twosum();
	}
	 public static void twosum() {
		 int num[] = {2,3,4,5} ;
	       
	       int target = 9;
	        int sum = 0;
	        for(int i = 0;i<num.length;i++){
	            sum = num[i] + num[i+1];
	            if(sum==target){
	                System.out.println(i+ ","+(i+1));
	             }
	        } 
	 } 
	    }


