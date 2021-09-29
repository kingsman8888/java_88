package test;
	public class _20_InvalidScoreException extends Exception{ // 점수입력
	
	// 자바 점수입력 
	  private int wrongScore;
	  
	//생성자
	public _20_InvalidScoreException(String message){
		super(message);
	} // } 빼먹음
	 //setter/getter
	public void setWrongScore(int wrongScore){
		this.wrongScore = wrongScore;
	}
	public int getWrongScore(){
		return wrongScore;
	}
	
	public void showWrongScore() { // 잘못된 점수
		System.out.println("잘못된 점수 : " + wrongScore);
              }

}