package codingBat.String1;

public class DeFront {
	public String deFront(String str) {    
		  String newstr = "";
		  if (str == ""){
			  return str;
		  }
		  else if (str.length() == 1){
			  if (str == "a"){
				  return "a";
			  }
			  else{
				  return "";
			  }
		  }
		  else if (str.length() == 2){
			  if (str.charAt(0) == 'a'){
				  if (str.charAt(1) == 'b'){
					  return "ab";
				  }
				  else{
					  return "a";
				  }
			  }
			  else{
				  if (str.charAt(1) == 'b'){
					return "b";	  
				  }
			  }
		  }
		  for (int i = 2; i < str.length(); i++){
			  newstr = newstr + str.charAt(i);
		  }
		  if (str.charAt(0) == 'a'){
			  if (str.charAt(1) == 'b'){
				  return "ab" + newstr;
			  }
			  else{
				  return "a" + newstr;
			  }
		  }
		  else if(str.charAt(1) == 'b'){
			  return "b" + newstr;
		  }
		  else{
			  return newstr;
		  }
	}

}
