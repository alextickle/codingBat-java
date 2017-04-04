package codingBat.Array1;

public class MidThree {
	public int[] midThree(int[] nums) {
		  int[] nums2 = new int[3];
		  nums2[0] = nums[nums.length / 2 - 1];
		  nums2[1] = nums[nums.length / 2];
		  nums2[2] = nums[nums.length / 2 + 1];
		  return nums2;
	}

}
