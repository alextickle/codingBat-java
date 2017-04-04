package CodingBat.Warmup1;

public class icyHot {
	public boolean icht(int a, int b){
		if ((a < 0 || b < 0) && (a > 100 || b > 100)){
			return true;
		}
		else{
			return false;
		}
	}

	public static void main(String[] args) {
		icyHot A = new icyHot();
		System.out.println(A.icht(-4, 140));

	}

}
