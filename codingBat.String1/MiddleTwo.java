package codingBat.String1;

public class MiddleTwo {
	public String middleTwo(String str) {
		  int n = str.length() / 2;
		  return "" + str.charAt(n - 1) + str.charAt(n);
	}

}
