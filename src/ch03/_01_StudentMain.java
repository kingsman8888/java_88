package ch03;

public class _01_StudentMain {
	public static void main(String[] args) {
		
		// 설계도를 만들고 힙메모리를 만들기 위해 메인을 생성하자.
		/*
		 * 인스턴스 생성: 클래스명 참조변수명 = new 클래스명(); // new 생성자;
		 *		 접근 : 참조변수명.멤버변수명;
		 *			   참조변수명.멤버메서드;
		 *  주소값은 int형으로 4바이트로 들어간다. (stack)
		 * 
		 * - 클래스의 자료형은 힙메모리에 저장된것이다.(클래스에 생성된것) - 멤버변수, 멤버메서드 = 설계도의 내용
		 * - 참조변수명에는 생성한 인스턴스의 힙메모리 공간 주소값이 들어있다. 스택메모리에 생성
		 * - 앞의 클래스명은 데이터 타입이고, 참조변수로 접근할때 사용한다.
		 * - 뒤의 클래스명은 힙메모리에 인스턴스 생성시 사용되는 생성자이다.
		 * 
		 */
		
		// 인스턴스는 설계된대로 만들어진다.
		// new 힙메모리에 올라간다. 참조변수에는 힙메모리 주소가 들어간다.
		_01_Student lee = new _01_Student();
		
		// 변수를 통해서 값을 초기화 (힙메모리에)
		// 멤모변수에 값 할당해서 출력문에서 출력할수 있도록
		// 접근 : 참조변수명.멤버변수명;
		lee.studentID = 202101;
		lee.studentName = "이미연";
		lee.grade = 1;
		lee.address = "서울특별시 마포구";
		lee.email = "lmy@naver.com";
		
		// 출력(메서드 호출) // 출력은 메인에서 실행해야한다.
		// 참조변수명.멤버메서드;  // 설계도 기준 
		lee.printInfo();
		
		System.out.println("============");
		
		
		_01_Student park = new _01_Student(); // _01_Student(); 메서드
		
		park.studentID = 202102;
		park.studentName = "박찬호";
		park.grade = 2;
		park.address = "서울특별시 강남구";
		park.email = "pch@gmail.com";
		
		park.printInfo();
		
		
		
		
		
	
	
	
	}
}
