
public class NonDecreasingArray {
	public boolean checkPossibility(int[] nums) {
		
		if(nums.length == 1) {
			return true;
		}
		
		int change = 0;
		
		for(int i = 1; i<nums.length; i++) {
			if(nums[i-1] > nums[i]) {
				
				change++;
				
				if(i+1 < nums.length && nums[i-1] > nums[i+1]) {
					if( i-2 >=0 && nums[i-2] > nums[i]) {
						return false;
					}
				}
			}
		}
	
		if(change == 1) {
			return true;
		}else {
			return false;
		}
	} 
	
	public static void main(String[] args) {
		NonDecreasingArray nda = new NonDecreasingArray();
		
		int[] nums = {1};
		System.out.println(nda.checkPossibility(nums));
	}
}
