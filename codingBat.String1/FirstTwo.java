package codingBat.String1;

public class FirstTwo {
	public String firstTwo(String str) {
		  if (str.length() < 3){
			  return str;
		  }
		  else{
			  return "" + str.charAt(0) + str.charAt(1);
		  }
	}

}
