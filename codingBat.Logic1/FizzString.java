package codingBatLogic1;

public class FizzString {
	public String fizzString(String str) {
		  if (str.charAt(0) == 'f'){
			  if (str.charAt(str.length() - 1) == 'b'){
				  return "FizzBuzz";
			  }
			  else{
				  return "Fizz";
			  }
		  }
		  else if (str.charAt(str.length() - 1) == 'b'){
			  return "Buzz";
		  }
		  else{
			  return str;
		  }
		 
	}

}
