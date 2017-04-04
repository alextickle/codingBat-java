package codingBat.String1;

public class Left2 {
	public String left2(String str) {
		  String newstr = "";
		  if (str.length() == 2){
			  return str;
		  }
		  for (int i = 2; i < str.length(); i++){
			  newstr = newstr + str.charAt(i);
		  }
		  newstr = newstr + str.charAt(0) + str.charAt(1);
		  return newstr;
	}

}
