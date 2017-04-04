package codingBat.Array1;

public class MakeLast {
	public int[] makeLast(int[] nums) {
		  int[] nums2 = new int[2 * nums.length];
		  nums2[nums2.length - 1] = nums[nums.length - 1];
		  return nums2;
	}

}
