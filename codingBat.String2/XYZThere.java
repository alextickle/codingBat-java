package codingBat.String2;

public class XYZThere {
	public boolean xyzThere(String str) {
		  if (str.length() < 3){
			  return false;
		  }
		  else if (str.length() == 3){
			  if (str.charAt(0) == 'x' && str.charAt(1) == 'y' && str.charAt(2) == 'z'){
				  return true;
			  }
			  else{
				  return false;
			  }
			  
		  }
		  else{
			  if (str.charAt(0) == 'x' && str.charAt(1) == 'y' && str.charAt(2) == 'z'){
				  return true;
			  }
			  for (int i = 1; i < str.length() - 2; i++){
				  if (str.charAt(i - 1) != '.' && str.charAt(i) == 'x' && str.charAt(i + 1) == 'y' && str.charAt(i + 2) == 'z'){
					  return true;
				  }
			  }
			  return false;
		  }
	}

}
