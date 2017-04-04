package CodingBat.Warmup1;

public class HasTeen {
	public boolean hasTeen(int a, int b, int c) {
		  boolean yes = false;
		  if (13 <= a && a <= 19){
			  yes = true;
		  }
		  else if (13 <= b && b <= 19){
			  yes = true;
		  }
		  else if (13 <= c && c <= 19){
			  yes = true;
		  }
		  return yes;
	}
}
