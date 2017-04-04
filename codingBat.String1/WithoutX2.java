package codingBat.String1;

public class WithoutX2 {
		public String withoutX2(String str) {
			  if (str.length() < 2){
				  if (str == "x"){
					  return "";
				  }
				  else{
					  return str;
				  }
			  }
			  String newstr = "";
			  for (int i = 0; i < str.length(); i++){
				  if (!((i == 0 && str.charAt(i) == 'x') || (i == 1 && str.charAt(i) == 'x'))){
					  newstr = newstr + str.charAt(i);
				  }
			  }
			  return newstr;
		}

}
