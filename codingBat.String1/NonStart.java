package codingBat.String1;

public class NonStart {
	public String nonStart(String a, String b) {
		  String newstr = "";
		  for (int i = 1; i < a.length(); i++){
			  newstr = newstr + a.charAt(i);
		  }
		  for (int j = 1; j < b.length(); j++){
			  newstr = newstr + b.charAt(j);
		  }
		  return newstr;
	}

}
