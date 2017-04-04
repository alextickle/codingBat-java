package codingBat.String2;

public class PrefixAgain {
	public boolean prefixAgain(String str, int n) {
		  String prefix = "";
		  for (int i = 0; i < n; i++){
			  prefix = prefix + str.charAt(i);
		  }
		  Boolean hasPrefix = false;
		  for (int j = 1; j < str.length() - n + 1; j++){
			  if (hasPrefix){
				  return true;
			  }
			  hasPrefix = true;
			  for (int k = 0; k < n; k++){
				  if (str.charAt(j + k) != prefix.charAt(k)){
					  hasPrefix = false;
				  }
					  
			  }
		  }
		  if (hasPrefix){
			  return true;
		  }
		  else{
			  return false;
		  }
	}
	public static void main(String[] args){
		PrefixAgain a = new PrefixAgain();
		System.out.println(a.prefixAgain("aa", 1));
	}

}
