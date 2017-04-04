package CodingBat.Warmup1;

public class IntMax {
	public int intMax(int a, int b, int c) {
		int max = 0;
		int[] all;
		all = new int[3];
		all[0] = a;
		all[1] = b;
		all[2] = c;
		for (int d : all){
			if (d > max){
				max = d;
			}
		}
		 return max; 
	}
}
