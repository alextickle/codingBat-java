package codingBatLogic1;

public class InOrderEqual {
	public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
		  if (equalOk){
			  if (a <= b && b <= c){
				  return true;
			  }
			  else{
				  return false;
			  }
		  }
		  else{
			  if (a < b && b < c){
				  return true;
			  }
			  else{
				  return false;
			  }
		  }
	}

}
