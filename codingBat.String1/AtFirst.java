package codingBat.String1;

public class AtFirst {
	public String atFirst(String str) {
		  if (str == ""){
			  return "@@";
		  }
		  else if (str.length() == 1){
			  return str + "@";
		  }
		  else{
			  return "" + str.charAt(0) + str.charAt(1);
		  }
	}

}
