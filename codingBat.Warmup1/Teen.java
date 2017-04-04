package CodingBat.Warmup1;

public class Teen {
	public boolean hasTeen(int a, int b, int c){
		if((a >= 13 && a <= 19)||(b >= 13 && b <= 19)||(c <= 19 && c >= 13)){
			return true;}
			else{
				return false;
			}
		}
	public static void main(String[] args){
		Teen A = new Teen();
		System.out.println(A.hasTeen(12, 11, 11));
		
	}
	}


