package codingBatLogic1;

public class More20 {
	public boolean more20(int n) {
		  if (n % 20 >= 1 && (((n - 1) % 20 == 0) || ((n - 2) % 20 == 0))){
			  return true;
		  }
		  else{
			  return false;
		  }
	}

}
