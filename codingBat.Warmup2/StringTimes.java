package CodingBat.Warmup2;

public class StringTimes {
	public String stringTimes(String str, int n) {
		String newstr = "";
		  for (int i = 0; i < n; i++){
			  newstr = newstr + str; 
		  }
		  return newstr;
	}
}
