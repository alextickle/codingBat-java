package codingBat.Logic2;

public class EvenlySpaced {
	public boolean evenlySpaced(int a, int b, int c) {
		  int max = a;
		  int min = a;
		  int mid = a;
		  int[] d = new int[3];
		  d[0] = a;
		  d[1] = b;
		  d[2] = c;
		  for (int i = 0; i < 3; i++){
			  if (d[i] > max){
				  max = d[i];
			  }
			  if (d[i] < min){
				  min = d[i];
			  }
		  }
		  for (int i = 0; i < 3; i++){
			  if (d[i] > min && d[i] < max){
				  mid = d[i];
			  }
		  }
		  if (max - mid == mid - min){
			  return true;
		  }
		  else{
			  return false;
		  }
	}

}
