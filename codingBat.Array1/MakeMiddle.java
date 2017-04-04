package codingBat.Array1;

public class MakeMiddle {
	public int[] makeMiddle(int[] nums) {
		  int[] nums2 = new int[2];
		  nums2[0] = nums[nums.length / 2 - 1];
		  nums2[1] = nums[nums.length / 2];
		  return nums2;
	}

}
