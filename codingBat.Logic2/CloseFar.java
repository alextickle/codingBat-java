package codingBat.Logic2;

public class CloseFar {
	public boolean closeFar(int a, int b, int c) {
		  if (Math.abs(a - b) <= 1){
			  if (Math.abs(c - a) >= 2 && Math.abs(c - b) >= 2){
				  return true;
			  }
			  else{
				  return false;
			  }
			 
		  }
		  else if (Math.abs(a - c) <= 1){
			  if (Math.abs(b - a) >= 2 && Math.abs(b - c) >= 2){
				  return true;
			  }
			  else{
				  return false;
			  }
		  }
		  else{
			  return false;
		  }
	}

}
