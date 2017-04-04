package codingBat.String2;

public class EndOther {
	public boolean endOther(String a, String b) {
		a = a.toLowerCase();
		b = b.toLowerCase();
		  if (a.length() > b.length()){
			  for (int i = 0; i < b.length(); i++){
				  if (a.charAt(a.length() - b.length() + i) != b.charAt(i)){
					  return false;
				  }
			  }
			  return true;
		  }
		  else if (a.length() == b.length()){
			  if (a == b){
				  return true;
			  }
			  else{
				  return false;
			  }
		  }
		  else{
			  for (int i = 0; i < a.length(); i++){
				  if (b.charAt(b.length() - a.length() + i) != a.charAt(i)){
					  return false;
				  }
			  }
			  return true;
		  }
	}

}
