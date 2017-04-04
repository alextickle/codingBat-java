package codingBat.Array1;

public class FrontPiece {
	public int[] frontPiece(int[] nums) {
		  if (nums.length < 2){
			  return nums;
		  }
		  else{
			  int[] nums2 = new int[2];
			  nums2[0] = nums[0];
			  nums2[1] = nums[1];
			  return nums2;
		  }
	}

}
