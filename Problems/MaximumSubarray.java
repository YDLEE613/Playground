
public class MaximumSubarray {
	public int maxSubArray(int[] nums) {

		int size = nums.length;
		int max = Integer.MIN_VALUE;
		int maxTmp = 0;

		for (int i = 0; i < size; i++) {
			
			maxTmp = maxTmp + nums[i];

			if (max < maxTmp) {
				max = maxTmp;
			}
			if (maxTmp < 0) {
				maxTmp = 0;
			}
		}
		return max;
	}

	public static void main(String[] args) {

		int[] ex = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		
		MaximumSubarray ms = new MaximumSubarray();
		System.out.println(ms.maxSubArray(ex));

	}
}
