package CodingBat.Warmup1;

public class d21 {
	public int diff21(int n){
		if (n > 21){
			return 2 * Math.abs(n - 21);}
			else{
				return Math.abs(n - 21);
		}
	}
	public static void main(String[] args) {
		d21 A = new d21();
		System.out.println(A.diff21(66));

	}

}
