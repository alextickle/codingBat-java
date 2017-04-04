package codingBat.String1;

public class Without2 {
	public String without2(String str) {
		  if (str.length() < 2){
			  return str;
		  }
		  else{
			  if (str.charAt(0) == str.charAt(str.length() - 2) && str.charAt(1) == str.charAt(str.length() - 1)){
				  if (str.length() == 2){
					  return "";
				  }
				  String newstr = "";
				  for (int i = 2; i < str.length(); i++){
					  newstr = newstr + str.charAt(i);
				  }
					  return newstr;
			  }
			  else{
				  return str;
			  }
		  }
	}

}
