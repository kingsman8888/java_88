package ch01;

public class _01_VariableEx {
	
	// ln 은 줄바꿈 println();
	public static void main (String[] args) {
		
		System.out.println("*** 변수 ***");
		System.out.println("변수 : 프로그래밍에서 값(Data)를 저장하기 위한 공간");
	
	// 변수와 설명 연결할때  + 삽입 	
	// 변수는 소문자로 시작한다.
	// 새로변수를 선언하지 않고 기존 변수를 이용할수있다 name 할시
		String name = "김태희"; // 자료형 String 변수 name 자료형 변수명 = 값;
		System.out.println("이름 : " + name);
		
		String name2 = "유치훈";
		System.out.println("이름 : " + name2);
		
		int age = 36;
		System.out.println("나이 : " + age);
		
		String email = "youchihun@naver.com";
		System.out.println("이메일 : " + email);
		
		String address = " 인천광역시 미추홀구 숙골로112번길 12";
		System.out.println("주 소 : " + address);
	}
}
