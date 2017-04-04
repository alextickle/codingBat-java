package CodingBat.Warmup2;

public class StringSplosion {
	public String stringSplosion(String str) {
		  String newstr = "";
		  for (int i = 0; i < str.length(); i++){
			  for (int j = 0; j <= i; j++){
				  newstr = newstr + str.charAt(j);
			  }
		  }
		  return newstr;
	}
}
