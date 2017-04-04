package codingBat.String2;

public class RepeatSeparator {
	public String repeatSeparator(String word, String sep, int count) {
		  String newstr = "";
		  if (count < 1){
			  return "";
		  }
		  for (int i = 0; i < count - 1; i++){
			  newstr = newstr + word + sep;
		  }
		  return newstr + word;
	}

}
