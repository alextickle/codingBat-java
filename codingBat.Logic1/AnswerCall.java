package codingBatLogic1;

public class AnswerCall {
	public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
		  if (isAsleep){
			  return false;
		  }
		  else if(isMorning){
			  if (isMom){
				  return true;
			  }
			  else{
				  return false;
			  }
		  }
		  else{
			  return true;
		  }
	}

}
