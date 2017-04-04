package codingBat.Array1;

public class Front11 {
	public int[] front11(int[] a, int[] b) {
		  if (a.length == 0){
			  if (b.length == 0){
				  int[] c = new int[0];
				  return c;
			  }
			  int[] c = new int[1];
			  c[0] = b[0];
			  return c;
		  }
		  else if (b.length == 0){
			  int[] c = new int[1];
			  c[0] = a[0];
			  return c;
		  }
		  else{
			  int[] c = new int[2];
			  c[0] = a[0];
			  c[1] = b[0];
			  return c;
		  }
	}

}
