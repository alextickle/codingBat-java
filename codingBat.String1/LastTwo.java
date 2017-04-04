package codingBat.String1;

public class LastTwo {
	public String lastTwo(String str) {
		  if (str.length() < 2){
			  return str;
		  }
		  else{
			  String newstr = "";
			  for (int i = 0; i < str.length(); i++){
				  if (i == str.length() - 2){
					  newstr = newstr + str.charAt(i + 1);
				  }
				  else if (i == str.length() - 1){
					  newstr = newstr + str.charAt(i - 1);
				  }
				  else{
					  newstr = newstr + str.charAt(i);
				  }
			  }
			  return newstr;
		  }
		  
	}

}
