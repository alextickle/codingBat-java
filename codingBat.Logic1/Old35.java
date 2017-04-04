package codingBatLogic1;

public class Old35 {
	public boolean old35(int n) {
		  if (n % 3 == 0){
			  if (n % 5 == 0){
				  return false;
			  }
			  else{
				  return true;
			  }
		  }
		  else if (n % 5 == 0){
			  return true;
		  }
			  else{
				  return false;
			  }
		  }
	}
