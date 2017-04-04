package codingBat.Array1;

public class MaxEnd3 {
	public int[] maxEnd3(int[] nums) {
		int max = 0;
		  if (nums[0] >= nums[nums.length - 1]){
			  max = nums[0];
			  }
		  else{
			  max = nums[nums.length - 1];
		  }
		  int[] nums2 = new int[nums.length];
		  for (int j = 0; j < nums.length; j++){
			  nums2[j] = max; 
		  }
		  return nums2;
	}

}
