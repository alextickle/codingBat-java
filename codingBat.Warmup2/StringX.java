package CodingBat.Warmup2;

public class StringX {
	public String stringX(String str) {
		if (str.length() <= 2){
			
		}
		  String newstr = "" + str.charAt(0);
		  for (int i = 1; i < str.length() - 1; i++){
			  if (str.charAt(i) != 'x'){
				  newstr = newstr + str.charAt(i);
			  }
		  }
		  newstr = newstr + str.charAt(str.length() -1);
		  return newstr;
	}

}
