package CodingBat.Warmup1;

public class negative {

	public boolean posNeg(int a, int b, boolean negative) {
		if(negative == false){
			if ((a > 0 && b < 0) || (a < 0 && b > 0)){
				return true;}
				else{
					return false;

	
			}
		}
		else{
			if (a < 0 && b < 0){
				return true;
			}
			else{
				return false;
			}
		}
		  
	}
public static void main(String[] args){
	negative A = new negative();
	System.out.println(A.posNeg(-3, -1, true));
	
}
}

