package CodingBat.Warmup1;

public class m10 {
	public boolean makes10(int a, int b){
		if ((a == 10 || b == 10) || a + b == 10){
			return true;}
			else{
				return false;
		}
	}

	public static void main(String[] args) {
		m10 A = new m10();
		System.out.println(A.makes10(10,6));

	}

}
