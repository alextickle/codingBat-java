package CodingBat.Warmup1;

public class StringE {
	public boolean stringE(String str) {
		char[] letters = new char[str.length()];
		int ecount = 0;
		for (int i = 0; i < str.length(); i++){
			letters[i] = str.charAt(i);
		}
		for (char a : letters){
			if (a == 'e'){
				ecount = ecount + 1;
			}
		}
		if (ecount <= 3 && ecount >= 1){
			return true;
		}
		else{
			return false;
		}
		  
	}
}
