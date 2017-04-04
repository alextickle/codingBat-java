package codingBat.Logic2;

public class NoTeenSum {
	public int noTeenSum(int a, int b, int c) {
		  return fixTeen(a) + fixTeen(b) + fixTeen(c);
	}
	public int fixTeen(int n){
		if (n <= 19 && n >= 13){
			if (n == 15 || n == 16){
				return n;
			}
			return 0;
		}
		else{
			return n;
		}
	}
}
