package CodingBat.Warmup1;

public class DelDel {
	public String delDel(String str) {
		  if (str.charAt(1) == 'd' && str.charAt(2) == 'e' && str.charAt(3) == 'l'){
			  String newstr = "" + str.charAt(0);
			  for (int i = 3; i < str.length() - 1; i++){
				  newstr = newstr + str.charAt(i);
			  }
			  return newstr;
		  }
		  else{
			  return str;
		  }
	}

}
