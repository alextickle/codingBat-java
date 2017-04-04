package codingBat.String2;

public class RepeatEnd {
	public String repeatEnd(String str, int n) {
		  String toAdd = "";
		  String newstr = "";
		  for (int j = str.length() - n; j < str.length(); j++){
			  toAdd = toAdd + str.charAt(j);
		  }
		  for (int i = 0; i < n; i++){
			  newstr = newstr + toAdd;
		  }
		  return newstr;
	}

}
