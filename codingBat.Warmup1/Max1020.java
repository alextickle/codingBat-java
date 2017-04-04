package CodingBat.Warmup1;

public class Max1020 {
	public int max1020(int a, int b) {
		if (10 <= a && a <= 20){
			if (10 <= b && b <= 20){
				if (a >= b){
					return a;
				}
				else{
					return b;
				}
			}
			return a;
		}
		else if (10 <= b && b <= 20){
			return b;
		}
		else{
			return 0;
		}
	}

}
