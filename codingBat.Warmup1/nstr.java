package CodingBat.Warmup1;

public class nstr {
	public String notString(String str) {
		  return "not " + str;

	}
	public static void main (String[] args){
		nstr A = new nstr();
		System.out.println(A.notString("dog"));
	}
}
