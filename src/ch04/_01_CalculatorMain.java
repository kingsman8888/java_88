package ch04;

public class _01_CalculatorMain {
	public static void main(String[] args) {
		
		double num1 = 10.0;
		double num2 = 5.0;
		
		// 인스턴스 생성
		_01_Calculator cal = new _01_Calculator();
		
		// 자료형 변수명 = 참조변수명.메서드 호출 
		double addR = cal.add(num1, num2);
		double subR = cal.sub(num1, num2);
		double mulR = cal.mul(num1, num2);
		double divR = cal.div(num1, num2);
		
		
		System.out.println("두수의 합 : " + addR); //리턴해서 출력 
		System.out.println("두수의 차 : " + subR);  
		System.out.println("두수의 곱 : " + mulR); 
		System.out.println("두수의 나누기 : " + divR); 
	}

}
