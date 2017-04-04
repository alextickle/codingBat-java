package codingBat.Logic2;

public class LoneSum {
	public int loneSum(int a, int b, int c) {
		int[] d = new int[3];
		d[0] = a;
		d[1] = b;
		d[2] = c;
		int count = 0;
		int sum = 0;
		for (int i = 0; i < 3; i++){
			for (int j = 0; j < 3; j++){
				if (d[i] == d[j]){
					count++;
				}
			}
			if (count < 2){
				sum = sum + d[i];
			}
			count = 0;
		}
		return sum;
	}

}
