package codingBat.Array1;

public class Sum3 {
	public int sum3(int[] nums) {
		  int sum = 0;
		  for (int i = 0; i < 3; i++){
			  sum = sum + nums[i];
		  }
		  return sum;
	}

}
