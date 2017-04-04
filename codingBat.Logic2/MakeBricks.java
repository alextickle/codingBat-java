package codingBat.Logic2;

public class MakeBricks {
	public boolean makeBricks(int small, int big, int goal) {
		  if (goal > 5 * big + small){
			  return false;
		  }
		  else{
			  if (goal % 5 > small){
				  return false;
			  }
			  else{
				  return true;
			  }
		  }
	}

}
