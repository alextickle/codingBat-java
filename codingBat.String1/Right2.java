package codingBat.String1;

public class Right2 {
	public String right2(String str) {
		  String newstr = "";
		  if (str.length() == 2){
			  return str;
		  }
		  newstr = newstr + str.charAt(str.length() - 2) + str.charAt(str.length() - 1);
		  for (int i = 0; i < str.length() - 2; i++){
			  newstr = newstr + str.charAt(i);
		  }
		  return newstr;
	}

}
