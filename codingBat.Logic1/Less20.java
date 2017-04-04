package codingBatLogic1;

public class Less20 {
	public boolean less20(int n) {
		  if ((n + 1) % 20 == 0 || (n + 2) % 20 == 0){
			  return true;
		  }
		  else{
			  return false;
		  }
	}

}
