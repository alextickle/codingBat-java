package codingBat.Array1;

public class RotateLeft3 {
	public int[] rotateLeft3(int[] nums) {
		  int[] nums2 = new int[3];
		  nums2[0] = nums[1];
		  nums2[1] = nums[2];
		  nums2[2] = nums[0];
		  return nums2;
	}

}
