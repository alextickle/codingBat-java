package CodingBat.Warmup1;

public class withinhundred {

	public boolean nearHundred(int n) {
		boolean close = true;
		  if (Math.abs(100 - n) <= 10) {
			  close = true;}
			  else if (Math.abs(200 - n) <= 10){
				  close = true;
			  }
			  else{
				  close = false;
			  }
		  return close;
	}
	public static void main(String[] args){
		withinhundred A = new withinhundred();
		System.out.println(A.nearHundred(37));
	}
}


