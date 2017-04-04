package CodingBat.Warmup2;

public class FrontTimes {
	public String frontTimes(String str, int n) {
		  String newstr = "";
		  String front = "";
		  for (int i = 0; i < str.length() && i < 3; i++){
			  front = front + str.charAt(i);
		  }
		  for (int i = 0; i < n; i++){
			  newstr = newstr + front;
		  }
		  return newstr;
	}

}
