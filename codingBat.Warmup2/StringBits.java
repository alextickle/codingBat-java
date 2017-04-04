package CodingBat.Warmup2;

public class StringBits {
	public String stringBits(String str) {
		String newstr = "";
		for (int i = 0; i < str.length(); i = i + 2){
			newstr = newstr + str.charAt(i);
		}
		  return newstr;
	}
}
