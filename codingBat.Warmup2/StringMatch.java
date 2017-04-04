package CodingBat.Warmup2;

public class StringMatch {
	public int stringMatch(String a, String b) {
		int count = 0;
		  for (int i = 0; i < a.length() - 1 && i < b.length() - 1; i++){
			  if (a.charAt(i) == b.charAt(i) && a.charAt(i + 1) == b.charAt(i + 1)){
				  count++;
			  }
		  }
		  return count;
	}
}
