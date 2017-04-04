package codingBat.String2;

public class XYZMiddle {
	public boolean xyzMiddle(String str) {
		if (str.length() < 3){
			return false;
		}
		if (str.length() == 3){
			if (str == "xyz"){
				return true;
			}
			else{
				return false;
			}
		}
		  if (str.length() % 2 == 0){
			  int mid = str.length() / 2;
			  if (str.charAt(mid - 1) == 'x' && str.charAt(mid) == 'y' && str.charAt(mid + 1) == 'z'){
				  return true;
			  }
			  else if (str.charAt(mid - 2) == 'x' && str.charAt(mid - 1) == 'y' && str.charAt(mid) == 'z'){
				  return true;
			  }
			  else{
				  return false;
			  }
		  }
		  else{
			  int mid = str.length() / 2;
			  if (str.charAt(mid - 1) == 'x' && str.charAt(mid) == 'y' && str.charAt(mid + 1) == 'z'){
				  return true;
			  }
			  else{
				  return false;
			  }
		  }
	}

}
