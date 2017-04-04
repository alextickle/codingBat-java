package codingBat.String1;

public class FrontAgain {
	public boolean frontAgain(String str) {
		  if (str.length() < 2){
			  return false;
		  }
		  if (str.charAt(str.length() - 2) == str.charAt(0) && str.charAt(str.length() - 1) == str.charAt(1)){
			  return true;
		  }
		  else{
			  return false;
		  }
	}

}
