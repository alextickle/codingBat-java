package CodingBat.Warmup1;

public class Front22 {
	public String front22(String str) {
		String newstr = "" + str.charAt(0) + str.charAt(1);
		for (int i = 0; i < str.length() - 1; i++){
			newstr = newstr + str.charAt(i);
		}
		newstr = newstr + str.charAt(0) + str.charAt(1);
		return newstr;
	}
}
