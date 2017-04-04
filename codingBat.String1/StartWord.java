package codingBat.String1;

public class StartWord {
	public String startWord(String str, String word) {
		  if (str.length() < word.length()){
			  return "";
		  }
		  boolean matches = true;
		  for (int i = 1; i < word.length(); i++){
			  if (word.charAt(i) != str.charAt(i)){
				  matches = false;
			  }
		  }
		  if (matches){
			  String newstr = "";
			  for (int j = 0; j < word.length(); j++){
				  newstr = newstr + str.charAt(j);
			  }
			  return newstr;
		  }
		  else{
			  return "";
		  }
	}

}
