package day2;

public class Solution {
	public static void main(String []args) {
		isPalindrome();

	}
	  public static void isPalindrome() {
		  int x = 122;
	        if(x<0 || x%10==0&&x!=0){
	            System.out.println("false");
	        }
	        int number = x;
	        int reverse=0;
	        int reverseNumber =0;
	        while(x>reverse){
	            int num = x%10;
	            reverseNumber = reverseNumber*10+num;
	            x = x/10;
	           
	         }
	         if(number == reverseNumber){
		            System.out.println("true");
	         }else {
	        	 System.out.println("false");
	         }
			
	        
	    }

}
