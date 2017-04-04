package CodingBat.Warmup1;

public class loneTeen {
	public boolean lt(int a, int b){
		if ((a <= 19 && a >= 13) && (b < 13 || b > 19)){
			return true;
		}
		else if ((a < 13 || a > 19) && (b <= 19 && b >= 13)){
			return true;
		}
		else{
			return false;
		}
	}

	public static void main(String[] args) {
		loneTeen A = new loneTeen();
		System.out.println(A.lt(12, 20));

	}

}
