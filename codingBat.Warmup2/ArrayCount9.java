package CodingBat.Warmup2;

public class ArrayCount9 {
	public int arrayCount9(int[] nums) {
		int count = 0;
		  for (int a : nums){
			  if (a == 9){
				  count++;
			  }
		  }
		  return count;
	}
}
