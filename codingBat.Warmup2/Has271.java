package CodingBat.Warmup2;

public class Has271 {public boolean has271(int[] nums) {
		  boolean hasIt = false;
		  for (int i = 0; i < nums.length - 2; i++){
			  if (nums[i + 1] == nums[i] + 5 && (nums[i] - 3 <= nums[i + 2] && nums[i] + 1 >= nums[i + 2])){
				  hasIt = true;
			  }
		  }
		  return hasIt;
	}
	

}
