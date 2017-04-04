package CodingBat.Warmup2;

public class NoTriples {
	public boolean noTriples(int[] nums) {
		  boolean noTrip = true;
		  for (int i = 0; i < nums.length - 2; i++){
			  if (nums[i] == nums[i + 1] && nums[i] == nums[i + 2]){
				  noTrip = false;
			  }
		  }
		  return noTrip;
	}
}
