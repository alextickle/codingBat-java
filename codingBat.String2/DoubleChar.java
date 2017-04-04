package codingBat.String2;

public class DoubleChar {
	public String doubleChar(String str) {
		  String newstr = "";
		  for (int i = 0; i < str.length(); i++){
			  newstr = newstr + str.charAt(i) + str.charAt(i);
		  }
		  return newstr;
	}

}
