package array;

public class TwoSum {

	public static void main(String[] args) {
		twosum();
	}

	public static void twosum() {
		int nums[] = { 3,2,3 };

		int target = 6;
		int sum = 0;
		 for(int i=1;i<nums.length;i++){
	            for(int j=i;j<nums.length;j++)
	            {
	                if(nums[j]+nums[j-i]==target){
	                   System.out.println(j-i+ "," +j);
	            }
	        }

		}
	}
	
}

