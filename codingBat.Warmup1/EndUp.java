package CodingBat.Warmup1;

public class EndUp {
	public String endUp(String str) {
		  String newstr = "";
		  if (str.length() < 4){
			  newstr = str.toUpperCase();
		  }
		  else{
		String end = "" + str.charAt(str.length() - 3) + str.charAt(str.length() - 2) + str.charAt(str.length() - 1);
		System.out.println(end);
		end = end.toUpperCase();
		System.out.println(end);
		  for (int i = 0; i < str.length() - 3; i++){
			  newstr = newstr + str.charAt(i);
		  }
		  newstr = newstr + end;
	}
		  return newstr;
	}
}
