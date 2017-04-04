package codingBat.String1;

public class FirstHalf{

public String firstHalf(String str) {
	  int n = str.length() / 2;
	  String newstr = "";
	  for (int i = 0; i < n; i++){
		  newstr = newstr + str.charAt(i);
	  }
	  return newstr;
}
}
