package codingBat.Logic2;

public class LuckySum {
	public int luckySum(int a, int b, int c) {
		int[] d = new int[3];
		d[0] = a;
		d[1] = b;
		d[2] = c;
		int sum = 0;
		for (int i = 0; i < 3; i++){
			if (d[i] == 13){
				break;
			}
			sum = sum + d[i];
		}
		  
		return sum;
	}

}
