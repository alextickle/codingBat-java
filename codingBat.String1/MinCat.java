package codingBat.String1;

public class MinCat {
	public String minCat(String a, String b) {
		  if (a.length() == b.length()){
			  return a + b;
		  }
		  else{
			  String newstr = "";
			  if (a.length() > b.length()){
				  newstr = "";
				  for (int i = a.length() - b.length(); i < a.length(); i++){
					  newstr = newstr + a.charAt(i);
				  }
				  return newstr + b;
			  }
			  else{
				  newstr = "";
				  for (int i = b.length() - a.length(); i < b.length(); i++){
					  newstr = newstr + b.charAt(i);
				  }
				  return a + newstr;
			  }
		  }
	}

}
