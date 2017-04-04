package CodingBat.Warmup1;

public class Front3 {
	public String front3(String str) {
		  String newstr = "" + str.charAt(0) + str.charAt(1) + str.charAt(2);
		  newstr = newstr + str.charAt(0) + str.charAt(1) + str.charAt(2);
		  newstr = newstr + str.charAt(0) + str.charAt(1) + str.charAt(2);
		  return newstr;
	}

}
