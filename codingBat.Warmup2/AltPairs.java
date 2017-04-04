package CodingBat.Warmup2;

public class AltPairs {
	public String altPairs(String str) {
		String newstr = "";
		for (int i = 0; i < str.length() - 1; i = i + 4){
			newstr = newstr + str.charAt(i) + str.charAt(i + 1);
		}
		if (str.length() % 2 == 0){
			return newstr;
	}
		else if (str.length() == 3) {
			return newstr;
		}
		else {
			newstr = newstr + str.charAt(str.length() - 1);
			return newstr;
		}
	}
}
