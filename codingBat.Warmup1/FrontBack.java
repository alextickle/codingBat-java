package CodingBat.Warmup1;

public class FrontBack {
	
	public String frontBack(String str) {
		String newstr = "" + str.charAt(str.length() - 1);
		for (int i = 1; i < str.length() - 1; i++){
			newstr = newstr + str.charAt(i);
			}
		return newstr + str.charAt(0);
	}

}
