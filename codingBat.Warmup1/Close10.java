package CodingBat.Warmup1;

public class Close10 {
	public int close10(int a, int b) {
		if (Math.abs(10 - a) < Math.abs(10 - b)){
			return a;
		}
		else if (Math.abs(10 - a) == Math.abs(10 - b)){
			return 0;
		}
		else{
			return b;
		}
		  
	}
}
