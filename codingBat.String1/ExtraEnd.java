package codingBat.String1;

public class ExtraEnd {
	public String extraEnd(String str) {
		  String newstr = "";
		  for (int i = 0; i < 3; i++){
			  newstr = newstr + str.substring(str.length() - 2, str.length());
		  }
		  return newstr;
	}

}
