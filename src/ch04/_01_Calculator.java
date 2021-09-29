package ch04;

public class _01_Calculator {

	
	/* 135page
	 * 함수 : 하나의 기능을 수행하는일련의 코드
	 * 
	 * 메서드 : 클래스안에 정의된함수
	 *   	  특정한 작업을 수행하는 문장들의 모임
	 *       입력을 받아서 처리결과를 반환하는 기능
	 *       메서드 호출시 메서드명이 일치해야 하며, 매개변수 갯수와 type이 일치해야 한다.(중요)
	 *       
	 * public 반환형 메서드명(매개변수1, 매개변수2,....)
	 *		return 반환값; // 처리결과를 반환하며, 반환형과 일치해야 한다. (중요)
	 *      
	 * 반환형이 void로 선언된 메서드는 결과값을 반환하지 않는다.
	 */
	
	
	public double add(double num1,double num2) { // void가 들어가면 에러 (아래 돌려줄려고 return들어갔기때문에 )
//		double result = num1 + num2; 
//		return result; // double형으로 반환하기때문에 return필요
		return num1 + num2;
	}
	public double sub(double num1,double num2) {
		double result = num1 - num2;
		return result;
	}
	public double mul(double num1,double num2) {
		return num1 * num2;
	}
	public double div(double num1,double num2) {
		double result = num1 / num2;
		return result;
	}
}
