package codingBat.Array1;

public class MaxTriple {
	public int maxTriple(int[] nums) {
		  if (nums[0] >= nums[nums.length / 2]){
			  if (nums[0] >= nums[nums.length - 1]){
				  return nums[0];
			  }
			  else{
				  return nums[nums.length - 1];
			  }}
			  else{
				  if (nums[nums.length / 2] >= nums[nums.length - 1]){
					  return nums[nums.length / 2];
				  }
				  else{
					  return nums[nums.length - 1];
		  }
	}
	}
	}

