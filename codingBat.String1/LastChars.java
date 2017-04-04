package codingBat.String1;

public class LastChars {
	public String lastChars(String a, String b) {
		  if (a == ""){
			  a = "@";
		  }
		  if (b == ""){
			  b = "@";
		  }
		  String newstr = "" + a.charAt(0) + b.charAt(b.length() - 1);
		  return newstr;
	}

}
