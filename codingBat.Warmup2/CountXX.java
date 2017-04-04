package CodingBat.Warmup2;

public class CountXX {
	int countXX(String str) {
		int xxcount = 0;
		for (int i = 0; i < str.length() - 1; i++){
			if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'x'){
				xxcount++;
			}
		}
		return xxcount;
	}
}
