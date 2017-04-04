package codingBat.Logic2;

public class BlackJack {
	public int blackjack(int a, int b) {
		  if (a > 21){
			  if (b > 21){
				  return 0;
			  }
			  else{
				  return b;
			  }
		  }
		  else if (b > 21){
			  return a;
		  }
		  else{
			  if (Math.abs(21 - a) <= Math.abs(21 - b)){
				  return a;
			  }
			  else{
				  return b;
			  }
		  }
	}

}
