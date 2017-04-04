package codingBat.String2;

public class MixString {
	public String mixString(String a, String b) {
		String newstr = "";
		  if (a.length() > b.length()){
			  for (int i = 0; i < b.length(); i++){
				  newstr = newstr + a.charAt(i) + b.charAt(i);
			  }
			  for (int j = b.length(); j < a.length(); j++){
				  newstr = newstr + a.charAt(j);
			  }
		  }
		  else{
			  for (int k = 0; k < a.length(); k++){
				  newstr = newstr + a.charAt(k) + b.charAt(k);
			  }
			  for (int l = a.length(); l < b.length(); l++){
				  newstr = newstr + b.charAt(l);
			  }
		  }
		  return newstr;
	}

}
