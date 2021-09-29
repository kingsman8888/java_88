package ch04;

public class _02_Sungjuk {

	//멤버변수
	private int korScore;
	private int engScore;
	private int mathScore;
	
	// 생성자로 값 설정
	// 153page
	/* 생성자는 클래스를 생성할 때만 호출하고, 멤버변수를 초기화한다.
	 * 생성자 이름은 클래스 이름과 같고, 생성자는 반환값이 없다.
	 * 기본생성자는 컴파일할 때 컴파일러가 자동으로 기본생성자를 만들어 준다.
	 * 하지마 매개변수 생성자가 존재하면 커파일러가 자동으로 기본생성자를 만들어 
	 * 
	 */
	
	public _02_Sungjuk() {};
	// 매개변수 생성자 (매개변수 -> 멤버변수)
	// 리턴타입 없다. 기본생성값은 내가 초기화 할 값들이 들어간다.
	public _02_Sungjuk(int korScore, int engScore, int mathScore) {
		this.korScore = korScore;
		this.engScore = engScore;
		this.mathScore = mathScore;
	}
	
	//setter로 값 설정  (값을 하나씩 멤버변수로 넣는다)
	public void setKorScore(int korScore){
		this.korScore = korScore;
	}
	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}	
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	
	//getToTAL() - 3과목 합계
	
	public int getToTAL() {  // 리턴타입 맞춰서 받아야한다 int
		return korScore + engScore + mathScore;
	}
	
	//getAvg() - 3 과목의 평균
	public int getAvg() {
		return (korScore + engScore + mathScore) / 3;
	}
	
}
