package codingBat.String1;

public class MiddleThree {
	public String middleThree(String str) {
		  String newstr = "" + str.charAt(str.length() / 2 - 1) + str.charAt(str.length() / 2) + str.charAt(str.length() / 2 + 1);
		  return newstr;
	}

}
