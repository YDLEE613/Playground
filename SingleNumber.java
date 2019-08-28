import java.util.HashMap;

public class SingleNumber {
	public static void main(String[] args) {
	
		SingleNumber sn = new SingleNumber();
		int[] numArray = {4,1,2,1,2};
		
		System.out.println(sn.singleNumber(numArray));
		
	}
	
	public int singleNumber(int[] nums) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		
		for(int i = 0; i<nums.length; i++) {
			// already contains the key
			if(hm.containsKey(nums[i])) {
				hm.remove(nums[i]);
			}else {
				hm.put(nums[i], 0);	
			}
		}
	
		
		return (int) hm.keySet().toArray()[0];
	}
}
