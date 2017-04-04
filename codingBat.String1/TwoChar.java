package codingBat.String1;

public class TwoChar {
	public String twoChar(String str, int index) {
		  if (index > str.length() - 2 || index < 0){
			  return "" + str.charAt(0) + str.charAt(1);
		  }
		  String newstr = "" + str.charAt(index) + str.charAt(index + 1);
		  return newstr;
	}

}
