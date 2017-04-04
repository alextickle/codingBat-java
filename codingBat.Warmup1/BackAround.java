package CodingBat.Warmup1;

public class BackAround {

	public String backAround(String str) {
		  char a = str.charAt(str.length() - 1);
		  str = a + str + a;
		  return str;
		}

	public static void main(String[] args) {
		BackAround b = new BackAround();
		System.out.println(b.backAround("cat"));

	}

}
