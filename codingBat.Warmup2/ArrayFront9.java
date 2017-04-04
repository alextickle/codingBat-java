package CodingBat.Warmup2;

public class ArrayFront9 {
	public boolean arrayFront9(int[] nums) {
		boolean has9 = false;
		  for (int i = 0; i < 4 && i < nums.length; i++){
			  if (nums[i] == 9){
				  has9 = true;
			  }
		  }
		  return has9;
	}
}
