package ch07;
//자식 클래스 - _04_Calc  인터페이스를 구현 ( =, - )
public abstract class _04_Calculator implements _04_Calc{
  // 2개만 추상메서드를 넣으면 오류 나머지는 자식에게 다시 넘기고 싶다. 자식 클래스 추가 생성
	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int sudstaract(int num1, int num2) {
		return num1 - num2;
	}
	
	//times, divide 메서드는 재정의 않함, 추상메서드 => 추상클래스
	
	
}
