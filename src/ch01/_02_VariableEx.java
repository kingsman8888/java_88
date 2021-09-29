package ch01;

public class _02_VariableEx {
	
	public static void main (String[] agrs) {
		
		int num1 = 20;
		int num2 = 10;
		
		// 정수 변수선언에 값을 넣고 다시 해당 연산을 위해 변수선언 후 출력
		// 빈공간 지울때 컨트롤 + D
		
		int addResult = num1 + num2;
		System.out.println ("두수의 합 : " + addResult);
		
		int subResult = num1 - num2;
		System.out.println ("두수의 빼기 : " + subResult);
		
		int mulResult = num1 * num2;
		System.out.println ("두수의 곱하기 : " + mulResult);
		
		int divResult = num1 / num2;
		System.out.println ("두수의 나누기 : " + divResult);
	}
}
