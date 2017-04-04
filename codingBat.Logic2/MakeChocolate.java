package codingBat.Logic2;

public class MakeChocolate {
	public int makeChocolate(int small, int big, int goal) {
		if (goal > 5 * big + small){
			  return -1;
		  }
		  else{
			  if (goal % 5 > small){
				  return -1;
			  }
			  else{
				  if (goal < 5 * big){
					  return (goal - (goal / 5) * 5);
				  }
				  else{
					  return (goal - 5 * big);
				  }
			  }
		  }
	}

}
