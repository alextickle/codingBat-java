package codingBat.String1;

public class WithouEnd2 {
	public String withouEnd2(String str) {
		  String newstr = "";
		  for (int i = 1; i < str.length() - 1; i++){
			  newstr = newstr + str.charAt(i);
		  }
		  return newstr;
	}

}
