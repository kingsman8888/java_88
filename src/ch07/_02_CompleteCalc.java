package ch07;
// 자식클래스
public class _02_CompleteCalc extends _02_Calc{
	
	// 두수의 합계 : 결과
	
	@Override
	public void add(int num1, int num2) { // or result 담아서 출력
		System.out.println("add : " + (num1+num2));
	}

	@Override
	public void sub(int num1, int num2) {
		System.out.println("sub : " + (num1 - num2));
	}

	@Override
	public void mul(int num1, int num2) {
		System.out.println("mul : " + (num1 * num2));
	}

	@Override
	public void div(int num1, int num2) {
		System.out.println("div : " + (num1/num2));
		
	}
	
}
