package codingBat.Array1;

public class Reverse3 {
	public int[] reverse3(int[] nums) {
		  int[] nums2 = new int[nums.length];
		  for (int i = 0; i < nums.length; i++){
			  nums2[i] = nums[nums.length - i - 1];
		  }
		  return nums2;
	}

}
