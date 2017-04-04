package CodingBat.Warmup1;

public class StartOz {
	public String startOz(String str) {
		String newstr = "";
		if (str.charAt(0) == 'o'){
			newstr = newstr + 'o';
		}
		if (str.charAt(1) == 'z'){
			newstr = newstr + 'z';
		}
		return newstr;
	}
}
