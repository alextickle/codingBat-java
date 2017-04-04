package codingBat.String1;

public class ConCat {
	public String conCat(String a, String b) {
		  if (a.length() == 0){
			  return b;
		  }
		  else{
			  if (b == ""){
				  return a;
			  }
			  if (a.charAt(a.length() - 1) == b.charAt(0)){
				  String b2 = "";
				  for (int i = 1; i < b.length(); i++){
					  b2 = b2 + b.charAt(i);
				  }
				  return a + b2;
			  }
			  else{
				  return a + b;
			  }
		  }
	}

}
