package ch07;

public class _02_Main {
	public static void main(String[] args) {
		
		//오류 추상클래스는 인스턴스 생성불가 (메서드가 불완전 메서드이므로)
		//_02_Calc cal = new _02_Calc cal();
		
		
		_02_Calc cal = new _02_CompleteCalc();
		
		// 재정의가된 자식메서드가 호출
		cal.add(10,30);
		cal.sub(50,10);
		cal.mul(8, 8);
		cal.div(8, 4);
		
		
	}

}
