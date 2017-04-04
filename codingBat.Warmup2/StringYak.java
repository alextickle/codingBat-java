package CodingBat.Warmup2;

public class StringYak {
	public String stringYak(String str) {
		String newstr = "";
		int countdown = str.length();
		for (int i = 0; countdown > 2; i++){
			if (str.charAt(i) == 'y' && str.charAt(i + 1) == 'a' && str.charAt(i + 2) == 'k' ){
				i = i + 2;
				countdown = str.length() - 1 - i;
			}
			else{
				newstr = newstr + str.charAt(i);
				countdown = str.length() - 1 - i;
			}
			
		}
		if (countdown == 2){
			newstr = newstr + str.charAt(str.length() - 2) + str.charAt(str.length() - 1);
			return newstr;
		}
		else if (countdown == 1){
			newstr = newstr + str.charAt(str.length() - 1);
			return newstr;
		}
		else{
		return newstr;
	}
	}
}
