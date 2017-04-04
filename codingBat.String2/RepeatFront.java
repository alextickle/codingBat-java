package codingBat.String2;

public class RepeatFront {
	public String repeatFront(String str, int n) {
		  String newstr = "";
		  String toAdd = "";
		  int count = n;
		  for (int i = 0; i < n; i++){
			  for (int j = 0; j < count; j++){
				  toAdd = toAdd + str.charAt(j);
			  }
			  newstr = newstr + toAdd;
			  count = count - 1;
			  toAdd = "";
		  }
		  return newstr;
		  
	}

}
