package codingBatLogic1;

public class LastDigit {
	public boolean lastDigit(int a, int b, int c) {
		  int count = 0;
		  if (a % 10 == b % 10){
			  count++;
		  }
		  if (b % 10 == c % 10){
		  
			  count++;
		  }
		  if (c % 10 == a % 10){
			  
			  count++;
		  }
		  if (count >= 1){
			  return true;
		  }
		  else{
			  return false;
		  }
	}

}
