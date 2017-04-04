package codingBat.Array1;

public class SwapEnds {
	public int[] swapEnds(int[] nums) {
		  int[] nums2 = new int[nums.length];
		  nums2[0] = nums[nums.length - 1];
		  for (int i = 1; i < nums.length - 1; i++){
			  nums2[i] = nums[i];
		  }
		  nums2[nums.length - 1] = nums[0];
		  return nums2;
	}

}
