package codingBat.Array1;

public class Make2 {
	public int[] make2(int[] a, int[] b) {
		  int[] c = new int[2];
		  int[] d = new int[a.length + b.length];
		  for (int j = 0; j < a.length; j++){
			  d[j] = a[j];
		  }
		  for (int k = a.length; k < d.length; k++){
			  d[k] = b[k - a.length];
		  }
		  for (int i = 0; i < 2; i++){
			  c[i] = d[i];
		  }
		  return c;
	}

}
