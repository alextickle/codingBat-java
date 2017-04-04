package codingBat.String2;

public class XYBalance {
	public boolean xyBalance(String str) {
		boolean hasY = false;
		  for (int i = 0; i < str.length(); i++){
			  if (str.charAt(i) == 'x'){
				  hasY = false;
				  for (int j = i + 1; j < str.length(); j++){
					  if (str.charAt(j) == 'y'){
						  hasY = true;
					  }
				  }
				  if (hasY == false){
					  return false;
				  }
			  }
			  
		  }
		  return true;
	}

}
