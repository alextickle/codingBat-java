package codingBat.String1;

public class HasBad {
	public boolean hasBad(String str) {
		if (str.length() < 3){
			return false;
		}
		else if (str.length() == 3){
			if (str.equals("bad")){
				return true;
			}
			else{
				return false;
			}
		}
		  String newstr1 = "";
		  String newstr2 = "";
		  for (int i = 0; i < 3; i++){
			  newstr1 = newstr1 + str.charAt(i);
		  }
		  for (int i = 1; i < 4; i++){
			  newstr2 = newstr2 + str.charAt(i);
		  }
		  if (newstr1.equals("bad") || newstr2.equals("bad")){
			  return true;
		  }
		  else{
			  return false;
		  }
	}

}
