package CodingBat.Warmup2;

public class Array123 {
	public boolean array123(int[] nums) {
		  boolean has123 = false;
		  for (int i = 0; i <= nums.length - 3; i++){
			  if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3){
				  has123 = true;
			  }
		  }
		  return has123;
	}
}
