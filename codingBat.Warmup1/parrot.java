package CodingBat.Warmup1;

public class parrot {
	
	public boolean parrotTrouble(boolean talking, int hour) {
		if (talking == true){
			if (hour < 7 || hour > 21){
				return true;
			}
			else{
				return false;
			}
			
		}
	else{
		return false;}
	}
		  public static void main(String[] args){
			  parrot Polly = new parrot();
			  System.out.println(Polly.parrotTrouble(true, 21));
	}
}
