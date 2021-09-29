package ch01;

public class _05_VaribleEx {
	
	// 61page
	/*
	 * 변하지 않는 값 상수 : 예약어 final사용
	 * 값을 바꾸지 못하게 사용 일반 변수와 다르게 PI 대문자를 써서 가독성 좋게 표현
	 * 이변수에 값을 대입금지 
	 * 상수는 대문자를 시작하여 사용  
	 */
	
	public static void main(String[] agrs) {
		/*
		 * final
		 * 1) 변수(상수) : 변수에 값 대입불가
		 * 2) 메서드 : 재정의 불가
		 * 3) 클래스 : 상속불가
		 */
		
		final double PI = 3.14; // 상수선언 및 초기화.. [면접에서 많이등장]
		double value = 0.5;
		
		double result = PI * value;
		System.out.println("result : " + result); //result : 1.57
		
		// PI = 3.15; // 오류 : 상수는 final로 선언하며, 변경 불가
	
		System.out.println("------------------");
		
		// 상수(MY_NAME MY_AGE)를 이용하여 이름과 나이를 출력하시오.
		
		final String MY_NAME = "유치훈";
		final int MY_AGE = 36;
		
		System.out.println("MY_NAME : " + MY_NAME);
		System.out.println("MY_AGE : " + MY_AGE);
		
		System.out.println("MY_NAME : " + MY_NAME + " MY_AGE : " + MY_AGE ); // 한줄로도 표현가능
		
		
		
		
		
	}
	

}
