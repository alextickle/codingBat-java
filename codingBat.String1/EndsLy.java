package codingBat.String1;

public class EndsLy {
	public boolean endsLy(String str) {
		if (str.length() < 2){
			return false;
		}
		  if (str.charAt(str.length() - 2) == 'l' && str.charAt(str.length() - 1) == 'y'){
			  return true;
		  }
		  else{
			  return false;
		  }
	}

}
