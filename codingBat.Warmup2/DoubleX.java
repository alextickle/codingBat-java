package CodingBat.Warmup2;

public class DoubleX {
	boolean doubleX(String str) {
		if (str.indexOf('x') == str.length() - 1){
			return false;
		}
		if (str.charAt(str.indexOf('x') + 1) == 'x'){
			return true;
		}
		return false;
		 
	}

}
