package ch01;

public class _03_VariavleEx {
	
	public static void main (String[] agrs) {
		
		/*  <--한뒤 엔터치면 자동생성
		 * 메서드명, 변수명은 소문자로 시작한다(cf. 클래스명은 대문자로 시작한다.)
		 * 변수 : 프로그래밍에서 값(Data)를 저장하기 위한공간이며,
		 * 		데이터의 저장과 참조를 위해 메모리 공간을 할당 받는다.
		 * 		반드시 먼저 선언 (선언을 하지 않고 변수에 값을 넣으면 오류) : 컴파일러는 변수의 자료형에 맞는 기억공간 미리 확보.
		 * 		선언 : 자료형 변수명; 예) int age; / String name;
		 * 		선언과 동시에 초기화 : 자료형 변수명 = 초기화; 예) int age = 30;
		 * 
		 * [면접문제]
		 * 1. 기본 자료형 (Primitive Type) : 실제 값이 저장 되는 공간 
		 * 	  정수형 : byte(1bit) -> short(2byte) -> int(4byte) -> long(8byte)
		 *   실수형 : float(4byte) -> double(8byte)
		 *   문자형 : char(2byte)
		 *   부울형 : boolean(true/false)
		 * 		
		 * 2. 참조형(Reference Type) 실제 객체를 가리키는 주소값이 저장되는 공간 -> 참조변수의 자료형
		 * 	  - 클래스 , 인터페이스, 배열	 
		 * 3. 문자열 : String 클래스 
		 */
		
		System.out.println("=== 정수형 변수 ===");
//		int num1;  // 선언
//		num1 = 10; // 초기화     동시에 주석을 잡을때는 블럭설정 후 컨트롤 / 
		
		int num1 = 10; // 선언과 동시에 초기화  위와 동일 
		long num2 = 123456780L; // long형은 숫자뒤에 L이나 l을 붙인다.
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		System.out.println("=== 실수형 변수 ===");
		
		float fnum1 = 3.14F; // float 형은 뒤에 F나 F를 붙인다.
		double dnum1 = 3.14; // double 형은 기본형이며, 생략
		System.out.println("fnum1 : " + fnum1);  // 문자사이와 변수사이를 연결하기위해 + 사용
		System.out.println("dnum1 : " + dnum1);
		
		
		System.out.println("=== char형 변수 ===");
		char ch1 = ' '; //char형은 ' ' 초기화시 공백이 있어야 함.  2byte기때문에 " " 주면 에러남 
		ch1 = 'A';  //ch1에 'A'로 초기화
		System.out.println("ch1 = " + ch1);
		
		System.out.println("=== 문자열 변수 ===");
		String name = ""; // String형은 "" 초기화시 공백이 없어도 된다.
		name  = "김태희"; // String은 클래스 이기 때문에 대문자로 시작해야 한다.(JAVA에서 만든 클래스)
		System.out.println("Name : " + name);
		
		System.out.println("=== 부울형 변수 ===");
		boolean isMarried = true; // 참
		boolean isStudent = false; // 거짓
		System.out.println("isMarried : " + isMarried);
		System.out.println("isStudent : " + isStudent);
	}
}
