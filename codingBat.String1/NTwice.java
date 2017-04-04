package codingBat.String1;

public class NTwice {
	public String nTwice(String str, int n) {
		  String newstr = "";
		  for (int i = 0; i < n; i++){
			  newstr = newstr + str.charAt(i);
		  }
		  for (int i = str.length() - n; i < str.length(); i++){
			  newstr = newstr + str.charAt(i);
		  }
		  return newstr;
	}

}
