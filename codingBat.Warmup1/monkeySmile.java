package CodingBat.Warmup1;

public class monkeySmile {
	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		boolean mtrouble = false;
		if (aSmile == false && bSmile == false){
			mtrouble = true;}
			else if (aSmile == true && bSmile == true){
				mtrouble = false;}
				else{
					mtrouble = false;
				}
			return mtrouble;}
	public static void main(String[] args) {
		monkeySmile A = new monkeySmile();
		System.out.println(A.monkeyTrouble(false, false));
	}

}
