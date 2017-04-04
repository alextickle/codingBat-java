package codingBatLogic1;

public class FizzString2 {
	public String fizzString2(int n) {
		  if (n % 3 == 0){
			  if (n % 5 == 0){
				  return "FizzBuzz!";
			  }
			  return "Fizz!";
		  }
		  else if (n % 5 == 0){
			  return "Buzz!";
		  }
		  else{
			  return Integer.toString(n) + "!";
		  }
	}

}
