package codingBat.String2;

public class CountCode {
	public int countCode(String str) {
		 int count = 0;
		  if (str.length() < 4){
			  return 0;
		  }
		  else {
			  for (int i = 0; i < str.length() - 3; i++){
				  if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'o' && str.charAt(i + 3) == 'e'){
					  count++;
				  }
			  }
			  return count;
		  }
	}

}
