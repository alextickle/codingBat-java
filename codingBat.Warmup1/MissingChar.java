package CodingBat.Warmup1;

public class MissingChar {
	
	public String missingChar(String str, int n) {
		String newstr = "";
		for (int i = 0; i < str.length(); i++){
			if (i != n){
				newstr = newstr + str.charAt(i);
			}
		}
		return newstr;
	}

}
