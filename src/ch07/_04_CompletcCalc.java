package ch07;
//자식클래스   - 부모를 상속받아서 추상메서드를 재정의(구현)
public class _04_CompletcCalc extends _04_Calculator{

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if ( num2 !=0) {
			return num1 / num2;	
		}else {
			return _04_Calc.ERROR;  // 인터페이스명.상수
		}
		
	}
	
	public void showInfo() {
		System.out.println("인터페이스를 구현하였습니다.");
	}

}
