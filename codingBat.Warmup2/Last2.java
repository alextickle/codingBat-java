package CodingBat.Warmup2;

public class Last2 {
	public int last2(String str) {
		if (str.length() < 4){
			return 0;
		}
		else{
	int count = 0;
	for (int i = 0; i < str.length() - 2; i++){
		if (str.charAt(str.length() - 2) == str.charAt(i) &&  str.charAt(str.length() - 1) == str.charAt(i + 1)){
			count++;
		}
	}
	return count;
	}}
}
