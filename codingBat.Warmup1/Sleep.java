package CodingBat.Warmup1;

public class Sleep {

	public boolean sleepIn(boolean weekday, boolean vacation) {
		boolean sleep = false;
		if (weekday == false){
			sleep = true;}
			else if (vacation == true){
			sleep = true;}
			else{
				sleep = false;}
			return sleep;
			}
	public static void main(String[] args){
		Sleep A = new Sleep();
		System.out.println(A.sleepIn(true, false));
	}
}


