package codingBat.String2;

public class CatDog {
	public boolean catDog(String str) {
		  int countcat = 0;
		  int countdog = 0;
		  if (str.length() < 3){
			  return true;
		  }
		  else{
			  for (int i = 0; i < str.length() - 2; i++){
				  if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'a' && str.charAt(i + 2) == 't' ){
					  countcat++;
				  }
				  if (str.charAt(i) == 'd' && str.charAt(i + 1) == 'o' && str.charAt(i + 2) == 'g' ){
					  countdog++;
				  }
			  }
			  if (countcat == countdog){
				  return true;
			  }
			  else{
				  return false;
			  }
		  }
	}

}
