package codingBat.String1;

public class ExtraFront {
	public String extraFront(String str) {
		String newstr = "";
		  if (str.length() < 2){
			  for (int i = 0; i < 3; i++){
				  newstr = newstr + str;
			  }
			  return newstr;
		  }
		  else{
			  for (int i = 0; i < 3; i++){
				  newstr = newstr + str.charAt(0) + str.charAt(1);
			  }
			  return newstr;
		  }
	}

}
