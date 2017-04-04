package CodingBat.Warmup1;

public class EveryNth {
	public String everyNth(String str, int n) {
		String newstr = "";
		for (int i = 0; i < str.length(); i = i + n){
			newstr = newstr + str.charAt(i);
		}
		return newstr;
	}
}
